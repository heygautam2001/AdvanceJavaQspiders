package resultset_MetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CommitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loaded");
			
			String url = "jdbc:postgresql://localhost:5433/school?user=postgres&password=root";
			
			Connection con = DriverManager.getConnection(url);
			
			System.out.println("Connection done");
			
			// Off the setAutoCommit Setting
			con.setAutoCommit(false);
			
			Statement stm = con.createStatement();
			String query = "insert into movie values(5,'Batman' , 7.9 , 654)";
			
			System.out.println(stm.executeUpdate(query));
			
			con.commit();
		
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}

	}

}
