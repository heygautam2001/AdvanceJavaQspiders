package send_redirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/send_redirect")
public class SendRedirectDemo extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String search = req.getParameter("search");
	
	if(search.equals("instagram")) {
		resp.sendRedirect("http://www.instagram.com");
	}else if(search.equals("index.jsp")) {
		resp.sendRedirect("index.jsp");
	}else if(search.equals("home.html")) {
		resp.sendRedirect("home.html");
	}else if(search.equals("greeting")) {
		resp.sendRedirect("greeting");
	}
	
}
}
