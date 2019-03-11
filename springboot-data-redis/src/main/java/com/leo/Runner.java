package com.leo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.leo.entity.User;

/**  
 *
 *  @author	Leowy Zhuang
 */
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private RedisTemplate<Object, Object> template;
	
	@Override
	public void run(String... args) throws Exception {
		
		User info = new User();
		info.setId(14);
		info.setName("wang2");
		info.setAge(18);
		info.setGender("女");
//		template.delete(template.opsForValue().get("*"));
//		template.opsForValue().set("z2w", info);
		
		System.out.println(template.opsForValue().get("aaaa"));
		template.opsForValue().set("aaaa", "zhangw");
		
		
	}

}
