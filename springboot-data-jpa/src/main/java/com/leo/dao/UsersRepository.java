package com.leo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.leo.entity.Users;

/**  
 *
 *  @author	Zhang Wei
 */
@Transactional
public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	List<Users> findAll();
	
	List<Users> findByName(@Param("name") String name);
	
	@Query("select u from Users u where u.name = :name and u.gender = :gender ")
	List<Users> findByNameAndGender(@Param("name")String name,@Param("gender")String gender);
	
	@Modifying
	@Query("delete from Users u where u.name = :name")
	void deleteByName(@Param("name")String name);
	
	@Modifying
	@Query("update Users set age = :age where name = :name")
	void updateByName(@Param("name")String name,@Param("age")Integer age);

}
