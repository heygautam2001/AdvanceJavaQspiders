package close_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.Driver;

public class CloseConnectionDemo {
	
	public static void main(String[] args) {
		Connection con = null;
		Driver d = new Driver();
	    try {
	    	DriverManager.registerDriver(d);
	    	System.out.println("Driver Registered");
	    	con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/servlet1?user=postgres&password=root");
	    	System.out.println("Connection Established");
	    	
	    	System.out.println(con.isClosed());
	    	
//	    	if(!con.isClosed()) {
//	    		con.close();
//	    		System.out.println("Connection closed !");
//	    	}
//	    	
//	    	Statement ps = con.createStatement(); // Runtime error because connection is already terminated.
	    	
	    	
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				if(!con.isClosed()) {
					
					con.close();
					System.out.println("Connection is closed !");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
