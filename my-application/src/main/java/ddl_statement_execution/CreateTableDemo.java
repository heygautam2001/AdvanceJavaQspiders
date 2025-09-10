package ddl_statement_execution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// step 1 load the driver
	   try {
		Class.forName("org.postgresql.Driver");
//		System.out.println("Package loaded");
		
		//Step 2 : establish the connection
		
		String url = "jdbc:postgresql://localhost:5433/school";
		String user = "postgres";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url , user , password);
//		System.out.println("Connection done");
		
		Statement st = con.createStatement();
//		System.out.println("statement created");
		
		String query = "create table employee(id integer primary key , name character varying(20) , salary double precision)";
//		System.out.println("query prepared");
		boolean result = st.execute(query); // DDL => false;
//		System.out.println(result);
		
		String query2 = "drop table employee";
		boolean result2 = st.execute(query2);
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
