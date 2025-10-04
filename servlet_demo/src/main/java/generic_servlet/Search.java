package generic_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet("/search")
public class Search extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(req.getParameter("search"));
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		
		//connect with database;
		// step1 : Load the driver
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded");
			
			//Establish the connection
			String url = "jdbc:postgresql://localhost:5433/servlet1";
			String user = "postgres";
			String pass = "root";
			
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("Connection Established");
			
			// prepare the statement
			String query = "select * from student where id = ?";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, id);
			ps.execute();
			
			ResultSet rs = ps.getResultSet();
			
		if(rs.next()) {
	        pw.println("<h1>"+rs.getString("name")+" "+rs.getString("email")+" "+
			rs.getLong("phone")+" "+rs.getDate("dob")+" "+
	        rs.getDouble("percentage")+"</h1>");
		}else {
			pw.println("<p>Sorry may be the record is not present ! </p>");
		}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	
		
	}

}
