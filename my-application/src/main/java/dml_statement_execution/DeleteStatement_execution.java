package dml_statement_execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DeleteStatement_execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// step 1 : load the driver
			Class.forName("org.postgresql.Driver");
			
			//step2: Connection properties file
			FileInputStream fis = new FileInputStream("/Users/gautam/Desktop/AdvanceJava/my-application/src/main/resources/data.properties");
			
			Properties property = new Properties();
			
			property.load(fis);
			
			String url = property.getProperty("url");
			
			Connection con = DriverManager.getConnection(url , property);
			System.out.println("Connection Established");
			
			// Step 3: creating the statement object
			
			Statement stm = con.createStatement();
			
			// Step 4 : Executing the sql queries(insert)
			
			String query = "DELETE FROM student WHERE id = 1";
			
			// way 1 : execute
			// true => dql
			// false => DML query
			
			boolean d = stm.execute(query);
			System.out.println(d);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Throwable e) {
			e.printStackTrace();
		}

	}

}
