package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.beans.User;


@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
@ComponentScan(value={"com.springboot.beans"})
public class SpringbootBasicBeansApplication {

	@Bean()
	public User user(){
		return new User("First Name", "Last Name");
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootBasicBeansApplication.class, args);
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		
		for(String beanName : beanNames){
			System.out.println(beanName);
		}
	
		System.out.println(ctx.getBean("user"));
		
		
	}
}
