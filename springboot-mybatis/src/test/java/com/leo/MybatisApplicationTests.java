package com.leo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.leo.entity.User;
import com.leo.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {
	
	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		
		List<User> userList = userMapper.getAll();
		for (User user : userList) {
			System.out.println(user);
		}
		
		User user = new User();
		user.setName("wang2");
		user.setAge(18);
		user.setGender("女");
//		userMapper.addUser(user);
		
//		userMapper.delUser(user);
		
		
	}

}

