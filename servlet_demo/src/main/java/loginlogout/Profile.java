package loginlogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/profile")

public class Profile extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] ck = req.getCookies();
		System.out.println(ck[0].getValue());
		System.out.println(ck[1].getValue());
		if(ck[0].getValue() == "" || ck[1].getValue() == ""){
			
			resp.sendRedirect("LoginLogout.html");
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			pw.println("<h1>All fields are mandotory</h1>");
		}else {
			resp.setContentType("text/html");
			PrintWriter pw = resp.getWriter();
			
			pw.println("<h1>Email= "+ck[0].getValue()+"</h1>");
			pw.println("<h1>Password= "+ck[1].getValue()+"</h1>");
			pw.println("<a href='logout'>Logout</a>");
			
		}
	
	}
	

}
