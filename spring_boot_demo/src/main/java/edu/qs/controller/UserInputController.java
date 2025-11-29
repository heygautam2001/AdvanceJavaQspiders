package edu.qs.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInputController {
	
	// 4 Ways
	
	// 1. Query Parameter
	
	// 2. @RequestHeader
	
	// 3. @PathVariable
	
	// 4. @RequestBody 
	
	
	@PostMapping("/save_student")
	public String saveStudentData(@RequestParam int id , @RequestParam(value="name")String name, @RequestParam double percentage ) {
		return "id "+ id + "name : "+name+ " , percentage : "+ percentage;
	}
	
	@PostMapping("/save_employee")
	public String saveEmployeeData(@RequestHeader int emp_id , @RequestHeader(value="name")String name, @RequestHeader double percentage ) {
		return "id "+ emp_id + "name : "+name+ " , percentage : "+ percentage;
	}
	@PostMapping()
	public String saveMovie () 
	{
		return null;
		
	}
	
	@PostMapping("/save_product")
	
	public Product saveProduct(@RequestBody Product prod) {
		
		return prod;
		
	} 


}
