package com.scaler.springboot.SpringbootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/api/greeting")
	public String offerGreeting() {
		return "Hello Welcome to springboot learning";
	}

}
