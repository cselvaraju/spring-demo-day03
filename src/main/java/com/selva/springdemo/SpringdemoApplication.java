package com.selva.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
//@ComponentScan
//@ComponentScan(basePackages = {"com.selva.service"})
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);

		System.out.println("================");

		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
		
		System.out.println("================");
		
				
		Organization org = context.getBean("nike", com.selva.springdemo.Organization.class);
		System.out.println(org.slogan());
		
	}

}
