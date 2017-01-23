/**
 * Alibaba.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.lightgreen.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * @author haikuo.zhk
 * @version $Id: GeniusCfg.java, v 0.1 2017年1月23日 下午1:16:37 haikuo.zhk Exp $
 */
@Component
public class GeniusCfg {

    @Value("${db.jdbcUrl}")
    private String dbJdbcUrl;

    @Value("${db.username}")
    private String dbUsername;

    @Value("${db.password}")
    private String dbPassword;

    public String getDbJdbcUrl() {
        return dbJdbcUrl;
    }

    public void setDbJdbcUrl(String dbJdbcUrl) {
        this.dbJdbcUrl = dbJdbcUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
}
