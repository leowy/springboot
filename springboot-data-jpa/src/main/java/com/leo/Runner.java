package com.leo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.leo.dao.UsersRepository;
import com.leo.entity.Users;

/**  
 *
 *  @author	Leowy Zhuang
 */
@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private UsersRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		System.out.println(userRepository.findAll());
		
		System.out.println(userRepository.count());
		System.out.println(userRepository.findByName("zhangw"));
		
		Users info = new Users();
		info.setId(1);
		info.setName("wang2");
		info.setAge(18);
		info.setGender("女");
		userRepository.save(info);
		System.out.println(userRepository.findAll());
		userRepository.delete(info);
		System.out.println(userRepository.findAll());
		System.out.println(userRepository.findByNameAndGender("wang2","女"));
		userRepository.deleteByName("wang2");
		userRepository.updateByName("zhang3",11);
		System.out.println(userRepository.findAll());
		
	}

}
