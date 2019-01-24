package com.leo.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataSourceConfig {
	
	@Bean(name = "primaryDataSource")
	@Qualifier("primaryDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.primary")
	@Primary
	public HikariDataSource primaryDataSource() {
		 return (HikariDataSource)DataSourceBuilder.create().build();
	}
	
	@Bean(name = "secondaryDataSource")
    @Qualifier("secondaryDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.secondary")
    public HikariDataSource secondaryDataSource() {
		return (HikariDataSource)DataSourceBuilder.create().build();
    }
	
	@Bean(name = "thirdDataSource")
	@Qualifier("thirdDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.third")
	public HikariDataSource thirdDataSource() {
		return (HikariDataSource)DataSourceBuilder.create().build();
	}

}
