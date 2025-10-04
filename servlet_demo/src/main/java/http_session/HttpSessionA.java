package http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionA")
public class HttpSessionA extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	 String name = req.getParameter("name");
 		String dob = req.getParameter("dob");
 		String email = req.getParameter("email");
 		Long phone = Long.parseLong(req.getParameter("phone"));
 		
 		HttpSession session = req.getSession();
 		User u = new User(name , dob , email , phone);
 		session.setAttribute("user",u);
 		
 		session.setMaxInactiveInterval(5);
 		
 		PrintWriter pw = resp.getWriter();
 		
 		resp.setContentType("text/html");
 		
 		pw.println("<a href='sessionView'> View Profile </a>");
		pw.println("<a href='sessionLogout'>Logout</a>");
 		
 		
 		
    	 
    	 
    }
}
