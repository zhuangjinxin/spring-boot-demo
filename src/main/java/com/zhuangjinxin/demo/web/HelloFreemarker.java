package com.zhuangjinxin.demo.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Freemarker模板引擎
 * 访问：http://localhost:8080/helloFreemarker
 * 返回：helloFreemarker.ftl
 */

@Controller
public class HelloFreemarker {
	
	@RequestMapping("/helloFreemarker")
	public String getThymeleaf(Map<String,Object> map){
		map.put("hello","I am Freemarker!");
		return "/helloFreemarker";
	}

}
