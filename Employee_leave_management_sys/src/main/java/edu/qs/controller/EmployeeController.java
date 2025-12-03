package edu.qs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.qs.model.entity.Employee;
import edu.qs.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/employee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp){
		
	     boolean result = empService.addEmployee(emp);
	     if(result) {
	    	 return new ResponseEntity<String>("Employee added successfully",HttpStatus.CREATED);
	     }
	     
	     return new ResponseEntity<String>("Employee cannot be added",HttpStatus.BAD_REQUEST);
		
	}
	
	

}
