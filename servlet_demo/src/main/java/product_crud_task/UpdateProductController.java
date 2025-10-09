package product_crud_task;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@WebServlet("/prod_dashboard")

public class UpdateProductController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		Double price = Double.parseDouble(req.getParameter("price"));
		String type = req.getParameter("type");
		Part part = null;
		InputStream is = null;
		
		if(req.getPart("image").getSize() != 0) {
			part = req.getPart("image");
			is = part.getInputStream();
			
		}
		
		Product p = new Product(id,name,price,type,null);
		
		ProductDao dao = new ProductDao();
		
		RequestDispatcher rd = req.getRequestDispatcher("prod_dashboard");
		
		if(dao.updateProduct(p, is)) {
			req.setAttribute("msg", "update successfull");
		}else {
			req.setAttribute("msg", "failed to update");
		}
		
		rd.forward(req, resp);
		
	}
}
