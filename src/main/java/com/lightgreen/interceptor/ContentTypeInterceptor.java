/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lightgreen.interceptor;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 忽略浏览器发过来的ContentType协商，强制发送application/json;charset=UTF-8或text/plain;charset=UTF-8，<br />
 * 适用于controller中ResponseBody注解方法的返回类型，String通过StringHttpMessageConverter、其他对象通过FastJsonHttpMessageConverter进行序列化，<br />
 * 但如果RequestMapping注解里定义了produces，就会以自定义的ContentType为准。
 * @author wanxin.twx
 * @version $Id: ContentTypeInterceptor.java, v 0.1 2016-4-1 下午10:37:16 wanxin.twx Exp $
 */
public class ContentTypeInterceptor extends HandlerInterceptorAdapter {

    public final static MediaType TEXT_PLAIN_UTF8       = MediaType.valueOf(MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8");
    public final static MediaType APPLICATION_JSON_UTF8 = MediaType.valueOf("application/json;charset=UTF-8");

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (handler instanceof HandlerMethod
            && ((HandlerMethod) handler).getMethod().getAnnotation(ResponseBody.class) != null
            && request.getAttribute(HandlerMapping.PRODUCIBLE_MEDIA_TYPES_ATTRIBUTE) == null) {
            Set<MediaType> mediaTypes = new LinkedHashSet<MediaType>();
            if (String.class.equals(((HandlerMethod) handler).getMethod().getReturnType())) {
                mediaTypes.add(TEXT_PLAIN_UTF8);
            } else {
                mediaTypes.add(APPLICATION_JSON_UTF8);
            }
            request.setAttribute(HandlerMapping.PRODUCIBLE_MEDIA_TYPES_ATTRIBUTE, mediaTypes);
        }
        return true;
    }
}
