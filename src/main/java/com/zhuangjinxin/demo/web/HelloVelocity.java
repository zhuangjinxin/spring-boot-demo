package com.zhuangjinxin.demo.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Velocity模板引擎
 * 访问：http://localhost:8080/helloVelocity
 * 返回：helloVelocity.html
 */

@Controller
public class HelloVelocity {
	
	 @RequestMapping("/helloVelocity")  
	 public String hello(Map<String,Object> map){  
	        map.put("name", "zhuangjinxin");  
	        return "helloVelocity";  
	    }  

}
