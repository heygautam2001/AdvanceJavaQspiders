package edu.qs.model.global_custom_exception;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyGlobalExceptionHandler {
	
	@ExceptionHandler(value = DuplicateEmaiOrPhoneException.class)
	public ResponseEntity<ExceptionInfo> DuplicateEmailOrPhoneException(DuplicateEmaiOrPhoneException e){
		ExceptionInfo info = new ExceptionInfo();
		info.setStatus(HttpStatus.BAD_REQUEST.value());
		info.setMessage("Duplcate email or phone found");
		info.setTime(LocalTime.now());
		return new ResponseEntity<ExceptionInfo>(info , HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<ExceptionInfo> EmployeeNotFoundException(EmployeeNotFoundException e){
		ExceptionInfo info = new ExceptionInfo();
		info.setStatus(HttpStatus.BAD_REQUEST.value());
		info.setMessage("Does not found the employee");
		info.setTime(LocalTime.now());
		return new ResponseEntity<ExceptionInfo>(info , HttpStatus.BAD_REQUEST);
		
	}
	
	

}
