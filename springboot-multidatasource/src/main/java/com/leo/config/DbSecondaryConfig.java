package com.leo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.zaxxer.hikari.HikariDataSource;

@MapperScan(basePackages = {"com.leo.mapper.secondary"},sqlSessionFactoryRef = "sqlSessionFactory2")
@Configuration
public class DbSecondaryConfig {
	
	@Autowired
    @Qualifier("secondaryDataSource")
    private HikariDataSource secondaryDs;

    @Bean
    public SqlSessionFactory sqlSessionFactory2() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        secondaryDs.setConnectionTestQuery("select 1");
        factoryBean.setDataSource(secondaryDs);
        return factoryBean.getObject();

    }

    @Bean("secondarySessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate2() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory2());
        return template;
    }
    
    @Bean("secondaryTransactionManager")
    public DataSourceTransactionManager masterTransactionManager() {
    	 return new DataSourceTransactionManager(secondaryDs); 
    }


}
