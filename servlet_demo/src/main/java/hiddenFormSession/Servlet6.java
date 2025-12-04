package hiddenFormSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet6")
public class Servlet6 extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  String name = req.getParameter("user");
	  
	  resp.setContentType("text/html");
	  PrintWriter out = resp.getWriter();
	  out.println("Name= "+name);
	
}
	
}
