package com.zhuangjinxin.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhuangjinxin.demo.domain.Zhuangjinxin;

/**
 * 使用配置文件中的单个属性
 * 访问：http://localhost:8080/multiConfig
 * 返回：I am zhuangjinxin,25 years old,and my gender is man.
 */


@RestController
public class UseMultipleConfigController {
	
	@Autowired
	private Zhuangjinxin zhuangjinxin;
	
	@RequestMapping("/multiConfig")
	public String printConfiguration(){
		return "I am " + zhuangjinxin.getName() +","+zhuangjinxin.getAge() +" years old,and my gender is "+zhuangjinxin.getGender()+".";
	}

}
