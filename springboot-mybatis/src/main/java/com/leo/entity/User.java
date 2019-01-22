package com.leo.entity;

import lombok.AllArgsConstructor;
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
public class User {
	
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private String gender;

}
