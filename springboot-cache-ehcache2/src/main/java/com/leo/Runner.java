package com.leo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.leo.entity.User;
import com.leo.mapper.UserMapper;

/**  
 *
 *  @author	Leowy Zhuang
 */
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		List<User> userList = userMapper.getAll();
		System.out.println(userList);
		
		List<User> userList1 = userMapper.getAll();
		System.out.println(userList1);
		
		User info = new User();
		info.setName("wang2");
		info.setAge(18);
		info.setGender("女");
		
		userMapper.addUser(info);
		
//		userMapper.delUser("wang2");
		
		List<User> userList2 = userMapper.getAll();
		System.out.println(userList2);

		List<User> userList3 = userMapper.getAll();
		System.out.println(userList3);
	}

}
