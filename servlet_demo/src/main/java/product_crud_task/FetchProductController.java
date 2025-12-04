package product_crud_task;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch_prod")
public class FetchProductController extends HttpServlet {
	RequestDispatcher rd;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(req.getParameter("id"));
		ProductDao dao = new ProductDao();
		Product prod = dao.viewProductById(id);
		
		req.setAttribute("product", prod);
		
		rd = req.getRequestDispatcher("update_product");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		rd.forward(req, resp);
		
	}

}
