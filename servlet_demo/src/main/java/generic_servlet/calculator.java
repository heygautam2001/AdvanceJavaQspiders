package generic_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class calculator extends GenericServlet {

	@Override          
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	    
	    int num1 = Integer.parseInt(req.getParameter("number1"));
	    int num2 = Integer.parseInt(req.getParameter("number2"));
	    String[] operation = req.getParameterValues("calculation");

	    res.setContentType("text/html");  // Set response type
	    PrintWriter pw = res.getWriter();

	    for (String op : operation) {
	        pw.println("<h1>Operation: " + op + "</h1>");
	        
	        if (op.equals("add")) {
	            int result = num1 + num2;
	            pw.println("<h2>Summation of " + num1 + " and " + num2 + " is " + result + "</h2>");
	        }else if(op.equals("mul")) {
	        	int result = num1 * num2;
	        	 pw.println("<h2>Multiplication of " + num1 + " and " + num2 + " is " + result + "</h2>");
	        }else if(op.equals("sub")) {
	        	 int result = num1 - num2;
	        	 pw.println("<h2> Difference of " + num1 + " and " + num2 + " is " + result + "</h2>");
	        }else {
	        	int result = num1 / num2;
	        	 pw.println("<h2> Division of " + num1 + " and " + num2 + " is " + result + "</h2>");
	        	
	        }
	    }
	}


}
