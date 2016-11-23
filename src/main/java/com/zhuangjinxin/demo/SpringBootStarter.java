package com.zhuangjinxin.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.zhuangjinxin.demo")
@MapperScan("com.zhuangjinxin.demo.mapper")
public class SpringBootStarter {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarter.class, args);
	}

}
