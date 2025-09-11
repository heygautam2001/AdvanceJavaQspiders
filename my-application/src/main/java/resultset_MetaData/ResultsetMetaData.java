package resultset_MetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetMetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loaded");
			String url = "jdbc:postgresql://localhost:5433/school?user=postgres&password=root";
			Connection con = DriverManager.getConnection(url);
			System.out.println("Connection done");
			Statement stm = con.createStatement();
			String query = "SELECT * FROM MOVIE";
			ResultSet rs = stm.executeQuery(query);
			
			ResultSetMetaData rmd = rs.getMetaData();
			
			System.out.println("col count : "+rmd.getColumnCount());
			
			for(int i = 1; i <= rmd.getColumnCount(); i++) {
				System.out.println
				("Col Name : "+ rmd.getColumnClassName(i)+""
					+ " ,Datatype"+rmd.getColumnTypeName(i)+
				" ,size "+rmd.getColumnDisplaySize(i));
			}
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
		

	}

}
