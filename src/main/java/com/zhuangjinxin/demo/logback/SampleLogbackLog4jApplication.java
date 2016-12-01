package com.zhuangjinxin.demo.logback;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SampleLogbackLog4jApplication {
	
	private static final Logger logger = Logger.getLogger(SampleLogbackLog4jApplication.class);
	
	@Scheduled(fixedDelay=3000)
	public void logSomething(){
		System.out.println("-------开始打印日志------");
		logger.info("Info Message");
		logger.debug("Debug Message");
		logger.trace("Trace Message");
		System.out.println("-------结束打印日志------");
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleLogbackLog4jApplication.class, args);
	}

}
