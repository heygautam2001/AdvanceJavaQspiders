package product_crud_task;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/add_product")
@MultipartConfig
public class AddProductController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String name = req.getParameter("name");
	Double price = Double.parseDouble(req.getParameter("price"));
	String type =req.getParameter("type");
	Part part = req.getPart("image");
	
	
	InputStream is =part.getInputStream();
	Product prod= new Product(name,price,type,null);
	ProductDao dao= new ProductDao();
	RequestDispatcher rd =req.getRequestDispatcher("add_product.jsp");
	if(dao.addProduct(prod,is)) {
		req.setAttribute("msg","product added successfully");
	}else {
		req.setAttribute("msg", "failed to  add the product");
	}
	is.close();
	rd.forward(req, resp);
	
}
}
