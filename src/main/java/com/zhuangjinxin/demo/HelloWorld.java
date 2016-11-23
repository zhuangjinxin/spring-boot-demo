package com.zhuangjinxin.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Thymeleaf模板引擎
 * 访问：http://localhost:8080/hello
 * 返回：Hello World !
 */

@Controller
public class HelloWorld {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "Hello World!";
	}
}
