package com.francescogit.animalService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.francescogit.animalService.services.GreetingService;
@Controller
public class PropertyInjectedController {

	@Autowired
	public GreetingService greetingService;
	

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String getGreeting() {
	
		return "Hello World";
		
	}
	
	
}
