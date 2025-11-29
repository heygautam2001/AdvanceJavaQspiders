package edu.qs.controller;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyExceptionController {
	
	
	@GetMapping("/message2")
	public ResponseEntity<String> message1(){
		
		try {
		int a = 1000/0; 
		
		}catch(ArithmeticException a) {
			System.out.println("Divide by zero");
			a.getMessage();
			return new ResponseEntity<String>("Arithemetic exception" ,HttpStatus.OK);   		
		}
		
		 return new ResponseEntity<String>("Arithemetic exception" ,HttpStatus.INTERNAL_SERVER_ERROR);   		
	}
	
	
	
//	@GetMapping("/message1")
//	@ExceptionHandler(value= ArithmeticException.class)
//	public ResponseEntity<ExceptionInfo> handleArithmeticException(ArithmeticException e){
//		ExceptionInfo info = new ExceptionInfo();
//		info.setMessage(e.getMessage());
//		info.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//		info.setTime(LocalTime.now());
//		
//		return new ResponseEntity<ExceptionInfo>(info, HttpStatus.INTERNAL_SERVER_ERROR);
//		
//	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<String> getUserNameById(@PathVariable int id){
		
		if(id ==1) {
			return new ResponseEntity<String>("Gautam" , HttpStatus.FOUND);
		}
		else if(id ==2) {
			return new ResponseEntity<String>("Priyanshi" , HttpStatus.FOUND);
		}
		else if(id ==3) {
			return new ResponseEntity<String>("Rudra" , HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<String>("user with "+id+" does not exist" ,HttpStatus.NOT_FOUND);
		}
		
	}
	
	

}



