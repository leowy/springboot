package com.leo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.leo.dao.IUserDao;
import com.leo.entity.User;

/**  
 *
 *  @author	Leowy Zhuang
 */
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println(userDao.findAll());
		
		System.out.println(userDao.findByName("zhangw"));
		
		User info = new User();
		info.setName("wang2");
		info.setAge(18);
		info.setGender("woman");
		userDao.insert(info);
		System.out.println(userDao.findAll());
		userDao.delete("wang2");
		System.out.println(userDao.findAll());
		
	}

}
