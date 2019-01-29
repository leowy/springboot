package com.leo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import lombok.Data;
import lombok.ToString;

/**  
 *
 *  @author	Leowy Zhuang
 */
@Entity
@NamedQuery(name="Users.findByName",query="select u from Users u where u.name = ?1")
@Data
@ToString(includeFieldNames=true)
public class Users implements Serializable{
	
	private static final long serialVersionUID = 218641213404968739L;

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private String gender;

}
