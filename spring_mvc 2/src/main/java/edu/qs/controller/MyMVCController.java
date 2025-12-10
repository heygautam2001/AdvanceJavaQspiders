package edu.qs.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyMVCController {

	@GetMapping("/index_page")
	public String getIndexPage() {
		return "index";
	}

	@GetMapping("/home")
	public String getHomePage() {
		return "home";
	}

	@GetMapping("/student_form")
	public String getStudentRegPage() {
		return "student_register";
	}

	@PostMapping("/view_student_data")
	public String viewStudentDetails(HttpServletRequest req) {

		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		Long phone = Long.parseLong(req.getParameter("phone"));
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");

		String[] skills = req.getParameterValues("skills");

		Student s = new Student(id, email, name, phone, dob, gender, country, skills);
		req.setAttribute("student", s);

		return "view_student";

	}

	@GetMapping("/message1")
	public void message1(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String msg = "hello from message1()";

		RequestDispatcher rd = req.getRequestDispatcher("/message2");
		req.setAttribute("message", msg);

		rd.forward(req, resp);

	}

	@GetMapping("/message2")
	public String message2() {

		return "message";
	}

	// Exceptions Handling...
	@GetMapping("/excp")
	public String Exception() {

		int x = 25 / 0;

		return "index.jsp";

	}

	@ExceptionHandler(value = ArithmeticException.class)
	public String handleArithmeticException(ArithmeticException e, HttpServletRequest req) {

		String msg = e.getMessage();

		req.setAttribute("message", msg);

		return "error";
	}

}
