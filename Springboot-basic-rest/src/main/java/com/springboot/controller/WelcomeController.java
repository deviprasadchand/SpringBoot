package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;
	
	@Value("${springboot.message}")
	private String message;
	
	@Value("${springboot.message.firstName}")
	private String firstName;
	
	@Value("${springboot.message.lastName}")
	private String lastName;
	
	@RequestMapping(value="/")
	public String getWelcomeMessage(){
		return welcomeService.prepareHelloWorldMessage(message, firstName, lastName);
		
	}
	
	
}
