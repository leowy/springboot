package com.leo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import com.leo.entity.User;

/**  
 *
 *  @author	Leowy Zhuang
 */
@CacheConfig(cacheNames="user")
public interface UserMapper {
	
	@Cacheable
	@Select("SELECT * FROM user")
	List<User> getAll();
	
	@CacheEvict(allEntries=true)
	@Insert("INSERT INTO user(name,age,gender) VALUES (#{user.name},#{user.age},#{user.gender})")
	int addUser(@Param("user")User user);
	
	@CacheEvict(allEntries=true)
	@Delete("DELETE FROM user WHERE name = #{name}")
	int delUser(@Param("name")String name);
	
	
}
