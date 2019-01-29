# springboot使用spring data JPA

`Spring Data JPA` 是 `Spring` 基于 `ORM` 框架、`JPA` 规范的基础上封装的一套 JPA 应用框架，底层使用了` Hibernate` 的 JPA 技术实现，可使开发者用极简的代码即可实现对数据的访问和操作。它提供了包括增删改查等在内的常用功能，且易于扩展    

参见官方文档：[https://docs.spring.io/spring-data/jpa/docs/current/reference/html](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
		
		1.配置：
		spring:
		  jpa:
		    hibernate:
		      ddl-auto: update #实体类自动维护数据库表结构功能
		    show-sql: true
		2.依赖包：
			implementation 'mysql:mysql-connector-java:5.1.34'
			implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
		
	
对于修改与删除需要添加事务	
			
