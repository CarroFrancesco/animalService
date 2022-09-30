package com.francescogit.animalService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.francescogit.animalService.controllers.PetController;
import com.francescogit.animalService.controllers.PrototypePetController;

@ComponentScan(basePackages = {"com.francescogit.animalService","com.francescogit.pets"})
@SpringBootApplication
public class AnimalServiceApplication {

	public static void main(String[] args) {
				
		ApplicationContext ctx = SpringApplication.run(AnimalServiceApplication.class, args);
		
	
		PetController petController = ctx.getBean(PetController.class);
		PetController petController2 = ctx.getBean(PetController.class);
		System.out.println("--- Best Pet is : ---");
		System.out.println(petController.bestPet());
		System.out.println(petController.bestPet());
		
		PrototypePetController prototypePetController = ctx.getBean(PrototypePetController.class);
		PrototypePetController prototypePetController2 = ctx.getBean(PrototypePetController.class);
		
		System.out.println("---Prototype Pet Controller---");
		System.out.println(prototypePetController.bestPet());
		System.out.println(prototypePetController2.bestPet());
	}

}
