package com.zhuangjinxin.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用配置文件中的单个属性
 * 访问：http://localhost:8080/singleConfig
 * 返回：My name is zhuangjinxin.
 */
@Controller
public class UseSingleConfigController {
	
	//@Value("${name}")  
	//private String name;
	
	@RequestMapping("/singleConfig")
	@ResponseBody
	public String printConfiguration(){
		//return "My name is " + name +".";
		return "My name is " + "zhuangjinxin" +".";
	}

}
