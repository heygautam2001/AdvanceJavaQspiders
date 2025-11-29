package edu.qs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBootController {
	@Autowired
	Student s;
	
	@GetMapping("/welcome")	
	public String welcomeMessage() {
		return "welcome to first Spring boot project";
		
	}
	
	@PostMapping("/greet")
	public String greeting() {
		return "Greerting boot developer";
	}
	
	@GetMapping("/get_Student")
	public Student getStudent() {
		return s;
	}
	
	
	

}
