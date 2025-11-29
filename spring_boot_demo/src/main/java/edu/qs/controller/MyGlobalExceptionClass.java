package edu.qs.controller;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class MyGlobalExceptionClass {
	@ExceptionHandler(value= ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handleArithmeticException(ArithmeticException e){
		
		ExceptionInfo info = new ExceptionInfo();
		info.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		info.setMessage("Arithemetic exception id there");
		info.setTime(LocalTime.now());
		
		return new ResponseEntity<ExceptionInfo>(info,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	
	@ExceptionHandler(value= UserNotFoundException.class)
	public ResponseEntity<ExceptionInfo> handleUserNotFoundException(UserNotFoundException e){
		
		ExceptionInfo info = new ExceptionInfo();
		info.setStatus(HttpStatus.NOT_FOUND.value());
		info.setMessage(e.getMessage());
		info.setTime(LocalTime.now());
		
		return new ResponseEntity<ExceptionInfo>(info,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	
	
	

}
