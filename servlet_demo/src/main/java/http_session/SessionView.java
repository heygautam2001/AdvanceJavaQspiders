package http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionView")
public class SessionView extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		User u = (User)session.getAttribute("user");
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		if( u != null) {
			pw.println("user name "+u.getName());
			pw.println("user dob "+u.getDob());
			pw.println("user eamil "+u.getEmail());
			pw.println("user phone "+u.getPhone());
		}else {
			pw.println("seems you have been logged out");
		}
		
	}

}
