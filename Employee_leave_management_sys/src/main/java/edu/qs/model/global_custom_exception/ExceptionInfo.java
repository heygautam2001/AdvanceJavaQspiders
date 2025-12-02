package edu.qs.model.global_custom_exception;

import java.time.LocalTime;

public class ExceptionInfo {
	
	private Integer status;
	private String message;
	private LocalTime time;
	
	public ExceptionInfo() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ExceptionInfo(Integer status, String message, LocalTime time) {
		super();
		this.status = status;
		this.message = message;
		this.time = time;
	}



	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	
	

}
