package com.leo.mapper;

import java.util.List;

import javax.cache.annotation.CacheDefaults;
import javax.cache.annotation.CacheRemove;
import javax.cache.annotation.CacheRemoveAll;
import javax.cache.annotation.CacheResult;
import javax.cache.annotation.CacheValue;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.leo.entity.User;

/**  
 * 	使用JCache接口
 *
 *  @author	Leowy Zhuang
 */
@CacheDefaults(cacheName="user")
public interface User2Mapper {
	
	@CacheResult
	@Select("SELECT * FROM user")
	List<User> getAll();
	
	@CacheRemoveAll
	@Insert("INSERT INTO user(name,age,gender) VALUES (#{user.name},#{user.age},#{user.gender})")
	int addUser(@Param("user")User user);
	
	@CacheRemove
	@Delete("DELETE FROM user WHERE name = #{name}")
	int delUser(@CacheValue@Param("name")String name);
	
	
}
