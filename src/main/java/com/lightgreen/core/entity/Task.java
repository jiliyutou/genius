/**
 * Alibaba.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.lightgreen.core.entity;

import java.util.Date;

/**
 * 
 * @author haikuo.zhk
 * @version $Id: Task.java, v 0.1 2017年1月23日 上午11:06:30 haikuo.zhk Exp $
 */
public class Task {

    private Long id;
    private String name;
    private String taskParam;
    private Integer status;
    private Date gmtCreated;
    private Date gmtModified;

    public Long getId() {
        return id;
    }
    public Task setId(Long id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }
    public Task setName(String name) {
        this.name = name;
        return this;
    }
    public String getTaskParam() {
        return taskParam;
    }
    public Task setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public Integer getStatus() {
        return status;
    }
    public Task setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Date getGmtCreated() {
        return gmtCreated;
    }
    public Task setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Date getGmtModified() {
        return gmtModified;
    }
    public Task setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
}
