package com.leo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@EnableCaching
@MapperScan("com.leo.mapper")
@SpringBootApplication
public class CacheEhcache3Application {

	public static void main(String[] args) {
		SpringApplication.run(CacheEhcache3Application.class, args);
	}

}

