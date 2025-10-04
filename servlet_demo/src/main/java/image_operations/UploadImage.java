package image_operations;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@WebServlet("/upload_img")
@MultipartConfig
public class UploadImage extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Part part = req.getPart("file");
		
		InputStream is = part.getInputStream();
		PrintWriter pw = resp.getWriter();
		
		resp.setContentType("text/html");
		
		String name = part.getSubmittedFileName();
		String content_type = part.getContentType();
		long size = part.getSize();

		 
	
		
		//Step 1: load the driver
		try {
			Class.forName("org.postgresql.Driver");
		
		
		String url = "jdbc:postgresql://localhost:5433/servlet1";
		String user = "postgres";
		String password = "root";
		
		
		//Step 2: Establish the connection
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("connection Established ! ");
		String query = "insert into image(name, content_type,size,data) values(?,?,?,?)";
		
		PreparedStatement ps =con.prepareStatement(query);
		
		ps.setString(1, name);
		ps.setString(2, content_type);
		ps.setLong(3, size);
		ps.setBinaryStream(4, is);
		
		if(ps.executeUpdate()>0) {
			pw.println("<h1> Image inserted successfully</h1>");
			
		}
		else {
			pw.println("<h1> Failed to insert the image</h1>");
		}
		
		is.close();
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