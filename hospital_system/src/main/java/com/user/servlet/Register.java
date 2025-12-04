package com.user.servlet;

import java.io.IOException;

import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/user_register")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String fullname = req.getParameter("fullname");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			User u = new User(fullname,email,password);
			
			UserDao dao = new UserDao(DBConnect.getConn()); 
			
			HttpSession session = req.getSession();
			
			
			
			boolean success = dao.userRegister(u);
			
			if(success) {
				session.setAttribute("sucMsg", "Registered successfully");
				resp.sendRedirect("signup.jsp");
				System.out.println("User registered successfully");
			}else {
				session.setAttribute("errMsg", "Something wrong on server");
				resp.sendRedirect("signup.jsp");
				System.out.println("User registration failed");
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
