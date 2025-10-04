package req_disp_forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/check_result")
public class CheckResultServ extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		
		Double perc = (Double)req.getAttribute("percentage");
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		pw.println("<h1> name "+name+"</h1>");
		pw.println("<h1> percentage "+perc+"</h1>");
		
		if(perc > 35) {
		pw.println("<h1>Result : PASSED</h1>");
		}else {
			pw.println("<h1>Result : FAILED </h1>");
		}

		
	}

}
