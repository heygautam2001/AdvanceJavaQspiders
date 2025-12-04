package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	 private static Connection conn;
	 
	 public static Connection getConn() {
		 try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5433/hospital";
			String user = "postgres";
			String pass = "root";
			conn = DriverManager.getConnection(url,user,pass);
		 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return conn;
	 }

}
