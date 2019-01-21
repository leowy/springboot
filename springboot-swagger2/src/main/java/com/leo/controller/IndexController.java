package com.leo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leo.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 *
 * @author Leowy Zhuang
 */
@Api(tags = { "页面操作" })
@RestController
public class IndexController {

	@ApiOperation(value = "首页访问")
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "Welcome swagger2!";
	}

	@ApiOperation(value = "登录操作")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestBody User user) {

		if ("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
			return "OK";
		}
		return "Failed";
	}

	@ApiImplicitParams({ 
		@ApiImplicitParam(value = "username", name = "username",example = "admin"),
		@ApiImplicitParam(value = "password", name = "password",example = "123456") })
	@ApiOperation(value = "搜索操作")
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(String username, String password) {
		return "OK";
	}

}
