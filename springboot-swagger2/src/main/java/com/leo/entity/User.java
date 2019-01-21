package com.leo.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**  
 *
 *  @author	Zhang Wei
 */
@Data
@ToString(includeFieldNames=true)
public class User {
	
	@ApiModelProperty(value="用户名",example="admin")
	private String username;
	
	@ApiModelProperty(value="密码",example="123456")
	private String password;
	
}
