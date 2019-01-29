package com.leo.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**  
 *
 *  @author	Zhang Wei
 */
@Data
@NoArgsConstructor
@ToString(includeFieldNames=true)
public class User implements Serializable{
	
	private static final long serialVersionUID = 218641213404968739L;

	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private String gender;

}
