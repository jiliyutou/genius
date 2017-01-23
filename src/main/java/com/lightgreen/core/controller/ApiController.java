/**
 * Alibaba.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lightgreen.core.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightgreen.common.config.GeniusCfg;
import com.lightgreen.core.service.TaskService;

/**
 * 
 * @author haikuo.zhk
 * @version $Id: ApiController.java, v 0.1 2016年8月14日 下午5:44:27 haikuo.zhk Exp $
 */
@Controller
@RequestMapping(value = "/api")
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private GeniusCfg geniusCfg;

    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/taobao.status", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public String taobaoStatus(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("error_code", 200);
        request.setAttribute("error_msg", "");
        return "success & ok";
    }

    @RequestMapping(value = "/task", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public HashMap<String, Object> task(HttpServletRequest request, HttpServletResponse response) {
        logger.info("/api/task");
        int taskId = (int) taskService.addTask(geniusCfg.getDbUsername(), geniusCfg.getDbPassword());
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("taskId", taskId);
        data.put("isSuccess", true);
        return data;
    }
}
