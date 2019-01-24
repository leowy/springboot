package com.leo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.leo.entity.User;

/**  
 *
 *  @author	Leowy Zhuang
 */
public interface UserMapper {
	
	@Select("SELECT * FROM users")
	List<User> getAll();
	
	@Insert("INSERT INTO users(userName,password,email) VALUES (#{user.userName},#{user.password},#{user.email})")
	int addUser(@Param("user")User user);
	
}
