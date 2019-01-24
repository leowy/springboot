package com.leo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariDataSource;

@MapperScan(basePackages = {"com.leo.mapper.primary"},sqlSessionFactoryRef = "sqlSessionFactory1")
@Configuration
public class DbPrimaryConfig {
	
	@Autowired
    @Qualifier("primaryDataSource")
    private HikariDataSource primaryDs;

    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        primaryDs.setConnectionTestQuery("select 1");
        factoryBean.setDataSource(primaryDs);
        return factoryBean.getObject();

    }

    @Bean("primarySessionTemplate")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory1());
        return template;
    }
    
    @Bean("primaryTransactionManager")
    @Primary
    public DataSourceTransactionManager masterTransactionManager() {
    	 return new DataSourceTransactionManager(primaryDs); 
    }


}
