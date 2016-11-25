package com.zhuangjinxin.demo.activemq;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class StartActiveMQ {
	
	@Bean
	public Queue queue(){
		return new ActiveMQQueue("sample.queue");
	};
	
	public static void main(String[] args) {
		SpringApplication.run(StartActiveMQ.class, args);
	}


}
