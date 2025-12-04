package hidden_from.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hidden_formA")
public class HiddenFormA extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		
		PrintWriter pw = resp.getWriter();
		
		resp.setContentType("text/html");
		
		pw.println("<form action='hiddenformB' method='post'>");
		
		pw.println("Email : <input type = 'email' name = 'email'><br>");
		pw.println("phone : <input type = 'tel' name = 'phone'><br>");
		
		pw.println("phone : <input type = 'hidden' name = 'name' value = '"+name+"'><br>");
		pw.println("phone : <input type = 'hidden' name = 'dob' value = '"+dob+"'><br>");
		
		pw.println("<input type = 'submit'>");
		
		
		
		
		pw.println("</form>");
		
		
		
	}
	

}
