package com.zhuangjinxin.demo.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Thymeleaf模板引擎
 * 访问：http://localhost:8080/helloThymeleaf
 * 返回：helloThymeleaf.html
 */

@Controller
public class HelloThymeleaf {
	
	@RequestMapping("/helloThymeleaf")
	public String getThymeleaf(Map<String,Object> map){
		map.put("Hello","I am thymeleaf!");
		return "/helloThymeleaf";
	}

}
