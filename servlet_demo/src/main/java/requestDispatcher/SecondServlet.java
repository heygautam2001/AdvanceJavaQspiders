package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String mail = (String) req.getAttribute("email");
		
		resp.setContentType("text/html");
		
		pw.println("<h1> hey "+mail+" welcome to your profile </h1>");
		
		
	
		
	}

}
