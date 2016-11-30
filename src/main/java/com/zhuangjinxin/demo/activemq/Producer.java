package com.zhuangjinxin.demo.activemq;


import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
//public class Producer implements CommandLineRunner {
public class Producer {
	
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired
	private Queue queue;

//	@Override
//	public void run(String... args) throws Exception {
//		send("Sample message");
//		System.out.println("Message was sent to the Queue");
//	}

	//@Scheduled(fixedDelay=3000)
	private void send() {
		this.jmsMessagingTemplate.convertAndSend(this.queue,"Hi,ActiveMQ");
	}
}
