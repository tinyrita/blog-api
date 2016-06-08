# 袁淼的博客API后端服务

## 简介
项目地址
- blog-api https://github.com/tinyrita/blog-api
- blog-app https://github.com/tinyrita/blog-app

API文档地址
- blog-doc http://localhost:80/doc/index.html

该项目是tinyrita的博客作业。

采用swagger标准及jax-rs规范构建博客通用API。

采用ECMAScript2015规范构建博客客户端应用。

[JAX-RS](https://jax-rs-spec.java.net/)

## 技术选型
### 后端API
- Java 8 语言
- jax-rs 开发规范
    
    JSR-311 (JAX-RS : Java API for RESTful Web Services)

- jersey 框架
- jetty 服务器
   
    真正的生产环境中，tomcat开源版本，早已不适合企业级应用。

    因此选用利于分布式部署，可定制化更强的jetty作为服务端。
  - jenkins

    jetty的分布式集成管理工具，可通过shell结合maven实现持续集成。

- maven 包管理器
  
  由于时间原因，并没有采用更加优秀的gradle作为包管理器

- jdk 1.8

### 前端应用
- ES6 语言

  js最新的ECMAScript2015标准，采用Promise异步处理数据，作为新标准的最佳实践

- angularjs2 框架

  严格封装ajax，当前最佳的单页棉前端应用框架

- webpack.js 包管理器

  前端自动化工具

- cordova

  应用进行封装后，可直接成为Android/IOS/WindowPhone 多端移动应用

## 项目结构
``` sh
## API后端源码
/src
  /gen/java/io/swagger
    /api 用户业务逻辑层
    /model 数据模型层
  /main/java/io/swagger/api
    /factories 工厂模式
    /impl 方法实现详情

## 项目前端源码
/src/main/webapp

```


## 运行部署

修改数据库配置文件

``` java
// /src/main/java/io/swagger/api/dao/DbUtil.java
// 修改为自己的数据库地址

public static final String URL = "jdbc:mysql://anasit.com:3306/blog?useUnicode=true&characterEncoding=UTF-8";
public static final String USER = "rita";
public static final String PASSWORD = "rita";

```

执行以下命令运行jetty服务器:

``` sh
mvn clean package jetty:run
```

可以访问网页版应用，做初步浏览。也可以选择下载apk进行体验。

``` sh
## 访问博客应用
http://localhost:80/blog/index.html
## 访问API文档
http://localhost:80/doc/index.html
```

执行以下命令获得可部署的war包，**注意部署tomcat一定需要安装ejb/jpa扩展**

``` sh
mvn install
```

## 贡献人员
- tinyrita http://tinyrita.github.io
- ryanemax http://ryanemax.github.io
