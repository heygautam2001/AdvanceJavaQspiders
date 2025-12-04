package cookiesSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
	    Cookie ck1 = new Cookie("name",name);
	    Cookie ck2 = new Cookie("pass",password);
	    resp.addCookie(ck1);
	    resp.addCookie(ck2);
	    
	    resp.setContentType("text/html");
	    
	    PrintWriter pw = resp.getWriter();
	    pw.println("<h1>Welecome to servletA !</h1>");
	    pw.println("<a href='servlet2'> ServletB</a>");
	    
		
		
	}

}
