package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		// Three string method;
		
		try {
		 Class.forName("org.postgresql.Driver");
		 System.out.println("Driver loaded");
		 
		 String url = "jdbc:postgresql://localhost:5433/school";
		 String user = "postgres";
		 String password = "root";
		 Connection con = DriverManager.getConnection(url , user , password);
		 System.out.println("Connection established");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		// One string method.
		
		try {
			
			// Load the driver
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loaded");
			
			// Create the connection.
			String url = "jdbc:postgresql://localhost:5433/school?user=postgres&password=root";
			Connection con = DriverManager.getConnection(url);
			System.out.println("Connection done");
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
		

	}

}
