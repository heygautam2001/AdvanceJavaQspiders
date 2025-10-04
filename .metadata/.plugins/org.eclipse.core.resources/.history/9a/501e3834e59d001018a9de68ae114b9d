package hidden_fromA.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hiddenformB")
public class HiddenFormB extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
		Long phone = Long.parseLong(req.getParameter("phone"));
		
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("name : "+ name);
		pw.println("dob : "+dob);
		pw.println("email : "+email);
		pw.println("phone : "+phone);
		
		
	}

}
