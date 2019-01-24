package com.leo.util;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DbBatch {
	
	
	@Autowired
	public SqlSessionTemplate template;
	
	@Transactional(rollbackFor = Exception.class)
	public <T> boolean execBatch(List<T> list ,String methodName,Class<?> mapperType,Class<?> paramType) {
		
		SqlSession session = template.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
		Object mapper = session.getMapper(mapperType);
		try {
			Method method = mapperType.getMethod(methodName, paramType);
			for(int i = 0; i < list.size(); i++) {
				method.invoke(mapper, list.get(i));
				if ( i % 1000 == 0 ||i == list.size()-1) {
					session.commit();
					session.clearCache();
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			return false;
		} finally {
			session.close();
		}
	}
	
}
