/**
 * Alibaba.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lightgreen.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author haikuo.zhk
 * @version $Id: ApiController.java, v 0.1 2016年8月14日 下午5:44:27 haikuo.zhk Exp $
 */
@Controller
@RequestMapping(value = "/api")
public class ApiController {
    
    @RequestMapping(value = "/query", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public HashMap<String, Object> query(HttpServletRequest request, HttpServletResponse response) {
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("isSuccess", true);
        return data;
    }
}
