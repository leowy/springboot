package com.leo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.leo.mapper")
@SpringBootApplication
public class MybatisBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisBatchApplication.class, args);
	}

}

