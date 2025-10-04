package image_operations;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fetch_img")
@MultipartConfig
public class FetchImageById extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		//Step 1: load the driver
				try {
					Class.forName("org.postgresql.Driver");
				
				
				String url = "jdbc:postgresql://localhost:5433/servlet1";
				String user = "postgres";
				String password = "root";
				
				
				//Step 2: Establish the connection
				
				Connection con = DriverManager.getConnection(url, user, password);
				
				String query="select data,content_type from image where id= ?";
				
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1,id);
				
				ResultSet rs =ps.executeQuery();
				
				if(rs.next()) {
					byte[] img = rs.getBytes("data");
					
					resp.setContentType(rs.getString("content_type"));
					OutputStream os =resp.getOutputStream();
					os.write(img);
					os.close();
				}
				
				else {
					PrintWriter pw= resp.getWriter();
					pw.println("<h1> Image with the provided id doesn't exist...</h1>");
				}
				con.close();
				
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	

}