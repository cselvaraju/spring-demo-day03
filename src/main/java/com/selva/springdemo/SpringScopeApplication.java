package com.selva.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.selva.scopedemo.BookDBService;
import com.selva.scopedemo.BookDBServiceImpl;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackages = {"com.selva.scopedemo"})
public class SpringScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringScopeApplication.class, args);

		BookDBService service = context.getBean(com.selva.scopedemo.BookDBServiceImpl.class);
		
//		System.out.println("service ==> " + service);
//		System.out.println("dao ==> " + service.getBookDao());
		
		LOGGER.info("service: {} bookDao: {}", service, service.getBookDao());
		LOGGER.info("Book service url: {}", service.getBookApiUrl());
		
//		BookDBService service2 = context.getBean(com.selva.scopedemo.BookDBServiceImpl.class);
//		
//		System.out.println("service ==> " + service2);
//		System.out.println("dao ==> " + service2.getBookDao());
//		
		((ConfigurableApplicationContext)context).close();
		
	}

}
