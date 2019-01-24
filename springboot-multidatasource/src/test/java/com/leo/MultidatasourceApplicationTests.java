package com.leo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.leo.entity.User;
import com.leo.mapper.primary.UserPriMapper;
import com.leo.mapper.secondary.UserSecMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultidatasourceApplicationTests {
	
	@Autowired
	private UserPriMapper userPriMapper;
	
	@Autowired
	private UserSecMapper userSecMapper;

	@Test
	public void contextLoads() {
		
		List<User> priUsers = userPriMapper.getAll();
		for (User user : priUsers) {
			System.out.println(user);
		}
		
		List<User> secUsers = userSecMapper.getAll();
		for (User user : secUsers) {
			System.out.println(user);
		}
	}

}

