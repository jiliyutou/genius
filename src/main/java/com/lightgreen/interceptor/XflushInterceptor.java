package com.lightgreen.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XflushInterceptor implements HandlerInterceptor {

    protected static final Logger logger = LoggerFactory.getLogger(XflushInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        request.setAttribute(Constants.API_START_TIME, System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
        long end = System.currentTimeMillis();
        if (request.getAttribute(Constants.ERROR_CODE) == null) {
            return;
        }
        int errorCode = (Integer) request.getAttribute(Constants.ERROR_CODE);
        String errMsg = (String) request.getAttribute(Constants.ERROR_MSG);
        long start = (Long) request.getAttribute(Constants.API_START_TIME);
        StringBuilder sb = new StringBuilder("[api]");
        sb.append("[").append(request.getRequestURI()).append("]");
        if (errorCode == 200) {
            sb.append("[Y]");
        } else {
            sb.append("[N]");
        }
        sb.append("[").append(errorCode).append("]");
        sb.append("[").append(request.getRemoteAddr()).append("]");
        sb.append("[").append(end - start).append("]");
        sb.append("[").append(errMsg).append("]");
        logger.info(sb.toString());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
    }
}
