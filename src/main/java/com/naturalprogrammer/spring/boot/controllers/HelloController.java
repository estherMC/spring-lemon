package com.naturalprogrammer.spring.boot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/spring-app-boot")
	public String home() {
		return "Hello from Spring App Boot 2";
	}


}