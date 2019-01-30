package com.leo.dao;

import java.util.List;

import com.leo.entity.User;

/**  
 *
 *  @author	Leowy Zhuang
 */
public interface IUserDao {
	
	List<User> findAll();
	
	List<User> findByName(String name);
	
	void insert(User user);
	
	void delete(String name);
	
}
