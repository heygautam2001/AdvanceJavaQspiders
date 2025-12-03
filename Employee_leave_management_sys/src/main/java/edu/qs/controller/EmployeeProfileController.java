package edu.qs.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.qs.model.entity.EmployeeProfile;
import edu.qs.service.EmployeeProfileService;

@RestController
public class EmployeeProfileController {
	
	@Autowired
	EmployeeProfileService empProfileService;
	
	@PostMapping("/employee_profile/{id}")
	public ResponseEntity<String> addEmployeeProfile(@PathVariable Integer id , @RequestBody EmployeeProfile empProfile){
		
		boolean result = empProfileService.addEmployeeProfile(id, empProfile);
		
		if(result) {
			return new ResponseEntity<String>("Employee profile added successfully" , HttpStatus.CREATED);
			
		}
		else {
			return new ResponseEntity<String>("Employee profile cannot be added" , HttpStatus.BAD_REQUEST);
		}
		
		
		
		
	}
	
	
	

}
