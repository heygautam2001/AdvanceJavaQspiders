package product_crud_task;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/remove_prod")
public class RemoveProductController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	int id = Integer.parseInt(req.getParameter("id"));
    	
    	ProductDao dao = new ProductDao();
    	
    	RequestDispatcher rd = req.getRequestDispatcher("prod_dashboard");
    	
    	if(dao.removeProduct(id)){
    		req.setAttribute("msg ", "product removed succesfully");
    	}
    	else {
    		req.setAttribute("msg", "failed to remove product");
    	}
    	
    	rd.forward(req, resp);
    	
    }
}
