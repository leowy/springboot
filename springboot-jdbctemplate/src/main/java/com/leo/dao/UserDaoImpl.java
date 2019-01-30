package com.leo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.leo.entity.User;

/**  
 *
 *  @author	Leowy Zhuang
 */
@Component
public class UserDaoImpl implements IUserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<User> findAll() {
		return jdbcTemplate.query("select * from User", new BeanPropertyRowMapper<>(User.class));
	}

	@Override
	public List<User> findByName(String name) {
		return jdbcTemplate.query("select * from user where name = ?", new BeanPropertyRowMapper<>(User.class), name);
	}

	@Override
	public void insert(User user) {
		jdbcTemplate.update("insert user(name,age,gender) VALUES(?,?,?)",
				user.getName(),user.getAge(),user.getGender());;
	}

	@Override
	public void delete(String name) {
		jdbcTemplate.update("delete from user where name = ?",name);

	}

}
