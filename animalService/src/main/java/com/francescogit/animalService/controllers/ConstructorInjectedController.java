package com.francescogit.animalService.controllers;

import org.springframework.stereotype.Controller;


import com.francescogit.animalService.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {

		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayHello();
	}
	
}
