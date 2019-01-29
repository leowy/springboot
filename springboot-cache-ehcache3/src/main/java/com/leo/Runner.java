package com.leo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.leo.entity.User;
import com.leo.mapper.User2Mapper;

/**  
 *
 *  @author	Zhang Wei
 */
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private User2Mapper userMapper;
//	@Autowired
//	private UserMapper userMapper;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println(userMapper.getAll());
		System.out.println(userMapper.getAll());
		
		User info = new User();
		info.setName("wang2");
		info.setAge(18);
		info.setGender("女");
		
		userMapper.addUser(info);
		
		System.out.println(userMapper.getAll());
		System.out.println(userMapper.getAll());
		
		userMapper.delUser("wang2");
		
		System.out.println(userMapper.getAll());
		System.out.println(userMapper.getAll());

	}

}
