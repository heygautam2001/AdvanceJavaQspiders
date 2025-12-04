package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.User;

public class UserDao {
	private Connection conn;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean userRegister(User u) {
		boolean f = false;
		
		try {
			String query = "insert into user_detail(fullname,email,password) values (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, u.getFullname());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				f = true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
