package com.leo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.leo.entity.User;
import com.leo.mapper.UserMapper;
import com.leo.util.DbBatch;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisBatchApplicationTests {

	@Autowired
	private DbBatch batch;
	
	@Test
	public void contextLoads() {
		
		List<User> infos = new ArrayList<>();
		for(int i=0; i< 10; i++) {
			User user = new User();
			user.setUserName("test1"+i);
			user.setPassword("123456"+i);
			user.setEmail("test"+i+"@gmail.com");
			infos.add(user);
		}
		
		boolean result = batch.execBatch(infos, "addUser", UserMapper.class, User.class);
		System.out.println(result);
	}

}

