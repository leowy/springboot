# springboot使用ehcache2缓存  

`Ehcache 2.x` 基于java的缓存方案，是一个开源的高性能缓存，拥有很高的拓展性和伸缩性
		
		1.application.yml配置使用：
		spring:
		  cache:
		       type: ehcache
    			ehcache:
    				config: classpath:ehcache-2.0.xml
		2.依赖包使用：
			implementation 'org.springframework.boot:spring-boot-starter-cache'
			implementation 'net.sf.ehcache:ehcache'
			
