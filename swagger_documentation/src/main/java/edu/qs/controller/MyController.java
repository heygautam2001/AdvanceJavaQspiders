package edu.qs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@Tag(name="User Controller APIs" , description = "Read ,update,Delete")
public class MyController {
    
	@GetMapping("/greet")
	public void greet() {
		System.out.println("Greeting users");
		
	}
	
	@GetMapping("/sayHello")
	public void sayHello(HttpServletRequest req, HttpServletResponse resp) {
		
		try {
			PrintWriter pw = resp.getWriter();
			pw.println("Hello user");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
