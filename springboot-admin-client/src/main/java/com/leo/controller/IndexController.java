package com.leo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
 *
 *  @author	Zhang Wei
 */
@RestController
public class IndexController {
	
	@RequestMapping("/index")
	public String index() {
		return "Hello,springboot-admin-client";
	}

}
