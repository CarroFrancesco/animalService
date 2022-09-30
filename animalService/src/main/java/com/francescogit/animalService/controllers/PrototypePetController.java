package com.francescogit.animalService.controllers;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.francescogit.pets.PetService;


@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Controller
public class PrototypePetController {
	
		private PetService petService;
		public int i;
		
			
		public PrototypePetController(PetService petService) {
			
			this.petService = petService;
		}

		
		public String bestPet() {
			System.out.println(i++);
			return petService.getPetType();
		}
		
		

}
