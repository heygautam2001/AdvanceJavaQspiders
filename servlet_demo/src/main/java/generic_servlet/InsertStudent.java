package generic_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/insert_stud")
public class InsertStudent extends GenericServlet {
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		int id = Integer.parseInt(req.getParameter("id"));
	    String name = req.getParameter("name");
	    String email = req.getParameter("email");
	    long phone =  Long.parseLong(req.getParameter("phone"));
	    String dob = req.getParameter("date");
	    double perc = Double.parseDouble(req.getParameter("percentage"));
	    
	    
	    PrintWriter pw = res.getWriter();
	    res.setContentType("text/html");
	    
	    // connect with the database
	    
	    // Step 1 : Load the driver
	    
	    try {
			Class.forName("org.postgresql.Driver");
			
			// step 2 : Establish the connection
			 
			String url = "jdbc:postgresql://localhost:5433/servlet1";
			String user = "postgres";
			String pass = "root";
			
			Connection con = DriverManager.getConnection(url,user,pass);
			
			// Step 3 : PrepareStatement
			
			String query = "insert into student values(?,?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setLong(4,phone);
			ps.setDate(5, Date.valueOf(dob));
			ps.setDouble(6, perc);
			
			
			
			// Step 4 : execute the query
			
			if(ps.executeUpdate() > 0) {
				System.out.println("Record inserted");
				pw.println("<h1> student record inserted successfully</h1>");
			}else {
				System.out.println("something went wrong while inserting the record");
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
