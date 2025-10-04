package search_record;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/search_func")
public class Search extends HttpServlet {

Connection con;
PreparedStatement ps;
@Override
	public void init() throws ServletException {
	
	try {
		
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded");
		
		String url = "jdbc:postgresql://localhost:5433/servlet1";
		String user = "postgres";
		String pass = "root";
		
		con = DriverManager.getConnection(url,user,pass);
		System.out.println("Connection Established");
		
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	// GETTING THE INFORMATION FROM THE FORM...
	int id = Integer.parseInt(req.getParameter("id"));
	
	// PREPARE QUERY AND EXECUTE IT WITH PREPAREDSTATEMENT ...
    String query = "SELECT id,name,email,phone FROM users WHERE id = ?";
    PrintWriter pw = resp.getWriter();
    try (PreparedStatement ps = con.prepareStatement(query)) {
        ps.setInt(1, id);
        
        
        RequestDispatcher rd = req.getRequestDispatcher("/search_func.html");
        resp.setContentType("text/html");
     try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
            	resp.getWriter().println("Login Successful");
                rd.include(req, resp);
                pw.print("<h2>userId :"+rs.getInt("id")+"<h2>");
                pw.print("<h2>Name :"+rs.getString("name")+"<h2>");
                pw.print("<h2>Email :"+rs.getString("email")+"<h2>");
                pw.print("<h2>Phone :"+rs.getLong("phone")+"<h2>");
                
            } else {
                resp.getWriter().println("<h2>PLEASE ENTER A VALID USER ID</h2>");
                rd.include(req,resp);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        resp.getWriter().println("ERROR WHILE FETCHING THE USER RECORD");
    }
}
}

