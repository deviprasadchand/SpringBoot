package com.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String prepareHelloWorldMessage(String message, String firstName, String lastName) {

		return message + "," + firstName + " " + lastName;
	}

}
