package req_disp_forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/calc_perc")
public class CalcPercServ extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Double physics = Double.parseDouble(req.getParameter("physics"));
		Double chemistry = Double.parseDouble(req.getParameter("chemistry"));
		Double math = Double.parseDouble(req.getParameter("math"));
		
		Double perc = ((physics+chemistry+math)/300) * 100;
		
		
		req.setAttribute("percentage", perc);
		System.out.println(perc);
		
		RequestDispatcher rd = req.getRequestDispatcher("check_result");
		
		rd.forward(req, resp);
	}
}
