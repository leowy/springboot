package com.leo.entity;

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
	
	private Integer uid;
	
	private String userName;
	
	private String password;
	
	private String email;
	
}
