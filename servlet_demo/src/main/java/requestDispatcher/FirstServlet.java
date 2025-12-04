package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class FirstServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	
	resp.setContentType("text/html");
	RequestDispatcher rd;
	PrintWriter pw = resp.getWriter();
	req.setAttribute("email",email);
	
	if(email.equals("gautam@gmail.com") && password.equals("Gautam@12345")) {
		rd = req.getRequestDispatcher("/SecondServlet");
		rd.forward(req, resp);
	}else {
		pw.print("Invalid credentials ! Authentication failed");
		rd = req.getRequestDispatcher("/requestDispatcher.html");
		rd.include(req, resp);
	}
}
}
