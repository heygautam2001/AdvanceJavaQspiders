package product_crud_task;

import java.io.IOException;
import javax.servlet.ServletException;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayImageController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Integer id = Integer.parseInt(req.getParameter("id"));
	ProductDao dao =new ProductDao();
	byte[] img =dao.getImageById(id);
    resp.setContentType("image/jpeg");
    OutputStream os = resp.getOutputStream();
    os.write(img);
    os.close();
}

}