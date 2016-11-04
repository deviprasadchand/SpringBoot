package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @SpringBootConfiguration
// @EnableAutoConfiguration
@ComponentScan(value = { "com.springboot.controller", "com.springboot.service" })
public class SpringbootBasicRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBasicRestApplication.class, args);
	}
}
