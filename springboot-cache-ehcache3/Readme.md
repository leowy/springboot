# springboot使用ehcache3缓存  

`Ehcache 3.x` 默认实现了`JCache`（JSR-107: JCACHE - Java Temporary Caching API）  
`Spring` 默认也支持 `JCache`
		
		1.application.yml配置使用：
		spring:
		  cache:
		    jcache:
		      config: classpath:ehcache-3.0.xml
		2.依赖包使用：
			implementation 'org.springframework.boot:spring-boot-starter-cache'
			implementation 'org.ehcache:ehcache:3.6.3'
			//implementation 'javax.cache:cache-api' //JSR-107 依赖包，spring默认支持JCache
			
Demo中 `User2Mapper.java`使用的是JCache接口，`UserMapper.java`使用的是springboot自带的