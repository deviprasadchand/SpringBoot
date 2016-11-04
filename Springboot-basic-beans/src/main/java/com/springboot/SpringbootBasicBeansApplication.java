package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
@ComponentScan(value={"com.springboot.beans"})
public class SpringbootBasicBeansApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootBasicBeansApplication.class, args);
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		
		for(String beanName : beanNames){
			System.out.println(beanName);
		}
	
	}
}
