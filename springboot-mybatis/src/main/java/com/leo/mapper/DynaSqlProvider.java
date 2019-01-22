package com.leo.mapper;

import org.apache.ibatis.jdbc.SQL;

import com.leo.entity.User;

/**
 *
 * @author Leowy Zhuang
 */
public class DynaSqlProvider {

	public String deleteUser(User user) {
		return new SQL() {
			{
				DELETE_FROM("user");
				if (user.getId() != null) {
					WHERE("user = #{user}");
				}
				
				if (user.getName() != null) {
					WHERE("name = #{name}");
				}
				
				if (user.getAge() != null) {
					WHERE("age = #{age}");
				}
				
				if (user.getGender() != null) {
					WHERE("gender = #{gender}");
				}
			}
		}.toString();
	}

}
