package resultset_MetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RollbackDemo {

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
			String query1 = "delete from movie where id = 5";
			String query2 = "delete from movie where id = 15";
			
			
			
			int res1 = stm.executeUpdate(query1);
			int res2 = stm.executeUpdate(query2);
			
			if(res1 > 0 && res2 > 0) {
				con.commit();
				System.out.println("All queries are commited successfully");
			}else {
				con.rollback();
				System.out.println("All queries are rolledbacked");
			}
				
			
			con.commit();
		
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}

	}

}
