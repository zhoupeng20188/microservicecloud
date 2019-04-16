# 工程详解
* microservicecloud 父模块
* microservicecloud-api 通用模块
* microservicecloud-provider-dept-8001 服务提供者集群
* microservicecloud-provider-dept-8001 服务提供者集群
* microservicecloud-provider-dept-8001 服务提供者集群
* microservicecloud-consumer-dept-80 服务消费者
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
