package urlRewritingSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet4")
public class Servlet4 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String username = req.getParameter("username");
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.println("<h1>Name : "+username+"</h1>");
	out.println("<a href='servlet4'></a>");
	
	
}
}
