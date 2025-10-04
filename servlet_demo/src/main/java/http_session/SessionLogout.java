package http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sessionLogout")
public class SessionLogout extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
	HttpSession session = req.getSession();
	session.invalidate();
	// destroys the session object
	
	PrintWriter pw = resp.getWriter();
	
	resp.setContentType("text/html");
	
	pw.println("<a href='sessionView'>View Profile</a>");
	

}
	
}
