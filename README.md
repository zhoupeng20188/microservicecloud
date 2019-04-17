# 用到技术
* SpringBoot
* Mybatis
* Druid
* SpringCloud Eureka
* SpringCloud Ribbon
* SpringCloud Feign
* SpringCloud Hystrix
* SpringCloud Zuul
* SpringCloud Config

# 工程详解
* microservicecloud 父模块
* microservicecloud-api 通用模块
* microservicecloud-provider-dept-8001 服务提供者集群
* microservicecloud-provider-dept-8002 服务提供者集群
* microservicecloud-provider-dept-8003 服务提供者集群
* microservicecloud-consumer-dept-80 服务消费者（内含Ribbon负载均衡）
* microservicecloud-consumer-dept-feign 服务消费者（内含Feign）
* microservicecloud-consumer-dept-hystrix-8001 服务消费者（内含hystrix）
* microservicecloud-eureka-7001 eureka注册中心集群
* microservicecloud-eureka-7002 eureka注册中心集群
* microservicecloud-eureka-7003 eureka注册中心集群

# 新建本地数据库
```
DROP DATABASE IF EXISTS cloudDB01;
CREATE DATABASE cloudDB01 CHARACTER SET UTF8;
USE cloudDB01;
CREATE TABLE dept
(
  deptno BIGINT NOT NULL PRIMARY  KEY AUTO_INCREMENT,
  dname VARCHAR(60),
  db_source VARCHAR(60)
);
INSERT INTO clouddb01.dept(dname,db_source) VALUES ('开发部','cloudDB01');
INSERT INTO clouddb01.dept(dname,db_source) VALUES ('人事部','cloudDB01');
INSERT INTO clouddb01.dept(dname,db_source) VALUES ('财务部','clouddb01');

DROP DATABASE IF EXISTS cloudDB02;
CREATE DATABASE cloudDB02 CHARACTER SET UTF8;
USE cloudDB02;
CREATE TABLE dept
(
  deptno BIGINT NOT NULL PRIMARY  KEY AUTO_INCREMENT,
  dname VARCHAR(60),
  db_source VARCHAR(60)
);
INSERT INTO clouddb02.dept(dname,db_source) VALUES ('开发部','cloudDB02');
INSERT INTO clouddb02.dept(dname,db_source) VALUES ('人事部','cloudDB02');
INSERT INTO clouddb02.dept(dname,db_source) VALUES ('财务部','clouddb02');

DROP DATABASE IF EXISTS cloudDB03;
CREATE DATABASE cloudDB03 CHARACTER SET UTF8;
USE cloudDB03;
CREATE TABLE dept
(
  deptno BIGINT NOT NULL PRIMARY  KEY AUTO_INCREMENT,
  dname VARCHAR(60),
  db_source VARCHAR(60)
);
INSERT INTO clouddb03.dept(dname,db_source) VALUES ('开发部','cloudDB03');
INSERT INTO clouddb03.dept(dname,db_source) VALUES ('人事部','cloudDB03');
INSERT INTO clouddb03.dept(dname,db_source) VALUES ('财务部','clouddb03');
```
# host文件设置
```
127.0.0.1 eureka7001.com
127.0.0.1 eureka7002.com
127.0.0.1 eureka7003.com
127.0.0.1 myzuul.com
```