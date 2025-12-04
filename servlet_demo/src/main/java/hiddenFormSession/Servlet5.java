package hiddenFormSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet5")
public class Servlet5 extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("name");
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	
	out.println(
			
			"<form action = 'servlet6'> <input type='hidden' name = 'user' value='"+name+"'><br> <button type='submit'>Submit</button> </form>"
			
			
		
			);
	
	
}
}
