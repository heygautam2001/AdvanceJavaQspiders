package load_register_java;

import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.Driver;
import org.postgresql.Driver;

public class RegisterDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();

		try {

			DriverManager.registerDriver(driver);
			System.out.println("Driver Register");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
