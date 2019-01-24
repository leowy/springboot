package com.leo.mapper.secondary;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.leo.entity.User;
import com.leo.mapper.DynaSqlProvider;

/**  
 *
 *  @author	Leowy Zhuang
 */
public interface UserSecMapper {
	
	@Select("SELECT * FROM user")
	List<User> getAll();
	
	@Insert("INSERT INTO user(name,age,gender) VALUES (#{user.name},#{user.age},#{user.gender})")
	int addUser(@Param("user")User user);
	
	@DeleteProvider(method = "deleteUser", type = DynaSqlProvider.class)
	int delUser(User user);
	
}
