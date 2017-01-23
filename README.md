# genius
## This is project for web applicaiton learning using spring mvc, mybatis, java sevelet page.

# changelog
## 2017-01-23
- 修改pom设置，新增基础的必要依赖：springmvc、fastjson、log4j、mysql、mybatis
- 修改dispatcher-servlet.xml，默认使用fastjson作为json反序列化工具
- 增加spring-mybatis.xml配置，使用阿里德鲁伊数据库连接池管理
- 拦截器配置，XFlushInterceptor和ContentTypeInterceptor
- mybatis使用基础框架搭建
- log4j日志配置