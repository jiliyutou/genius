/**
 * Alibaba.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.lightgreen.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightgreen.core.dao.TaskDao;
import com.lightgreen.core.entity.Task;

/**
 * 
 * @author haikuo.zhk
 * @version $Id: TaskService.java, v 0.1 2017年1月23日 上午11:44:34 haikuo.zhk Exp $
 */
@Service
public class TaskService {

    private static final Logger logger = LoggerFactory.getLogger(TaskService.class);

    @Autowired
    private TaskDao taskDao;

    public long addTask(String name, String taskParam) {
        Task task = new Task();
        task.setName(name).setStatus(0).setTaskParam(taskParam);
        taskDao.createTask(task);
        logger.info("add task success");
        return task.getId();
    }
}
