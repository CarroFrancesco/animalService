package com.francescogit.animalService.controllers;

import org.springframework.stereotype.Controller;


import com.francescogit.pets.PetService;

@Controller
public class PetController {
	
		private PetService petService;
		public int i;
		
			
		public PetController(PetService petService) {
			super();
			this.petService = petService;
		}

		
		public String bestPet() {
			System.out.println(i++);
			return petService.getPetType();
		}
		
		

}
