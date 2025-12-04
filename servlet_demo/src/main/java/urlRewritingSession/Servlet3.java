package urlRewritingSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name = req.getParameter("name");
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	
	out.println("<h1>Name: "+name+"</h1>");
	out.println("<a href='servlet4?username="+name+"'>Servlet 4</a>");
	
	
	
}
}
