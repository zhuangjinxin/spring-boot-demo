package com.zhuangjinxin.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhuangjinxin.demo.domain.User;

@RestController
public class HelloJson {
	
	@RequestMapping("/json")
	public User getJson(){
		User user =new User();
		user.setId(10001);
		user.setUsername("zhuangjinxin");
		user.setPassword("123");
		return user;
	}
	
	//返回结果：{"id":10001,"username":"zhuangjinxin","password":"123"}
}
