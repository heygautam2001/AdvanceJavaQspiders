package hidden_from.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/urlA")
public class UrlRewritingA extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String email = req.getParameter("email");
		Long phone = Long.parseLong(req.getParameter("phone"));
		
		PrintWriter pw = resp.getWriter();
		
		resp.setContentType("text/html");
		
		pw.println("<a href = 'urlB?name="+name+"&dob="+dob+"&email="+email+"&phone="+phone+"'>View Profile </a>");
	
	}

}
