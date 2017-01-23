/**
 * Alibaba.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.lightgreen.core.dao;

import com.lightgreen.core.entity.Task;


/**
 * 
 * @author haikuo.zhk
 * @version $Id: TaskDao.java, v 0.1 2017年1月23日 上午11:12:13 haikuo.zhk Exp $
 */
public interface TaskDao {

    public Task selectTaskById(int id);

    public void createTask(Task task);

    public void updateTask(Task task);

}
