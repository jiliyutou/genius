/**
 * Alibaba.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.lightgreen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author haikuo.zhk
 * @version $Id: ViewController.java, v 0.1 2016年8月14日 下午7:41:41 haikuo.zhk Exp $
 */
@Controller
public class JSPController {
    
    @RequestMapping(value = "/jsp/index.html")
    @ResponseBody
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("index");
        mav.addObject("book", "Spring MVC");
        mav.addObject("price", 10.11);
        return mav;
    }
}
