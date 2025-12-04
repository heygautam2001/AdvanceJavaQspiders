package rd_disp_include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/rd_include")
public class ReqDispIncludeDemo extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		RequestDispatcher rd = req.getRequestDispatcher("rd_include.html");
		
		if(email.equals("user@gmail.com") && pass.equals("user1234")) {
			pw.print("Logged In");
		}else {
			pw.print("Login authentication failed");
			rd.include(req, resp);
		}
		
		
		
	}

}
