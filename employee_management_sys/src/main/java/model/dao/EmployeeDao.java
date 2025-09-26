package model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import model.entities.Employee;

public class EmployeeDao {

	Properties property;
	FileInputStream fis;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Statement stm;
	
	public EmployeeDao() {
		
		try {
			fis = new FileInputStream("/Users/gautam/Desktop/AdvanceJava/employee_management_sys/src/main/resources/data.properties");
			property = new Properties();
			property.load(fis);
			
			String driver = property.getProperty("driver");
			
			//Step 1: Load the driver
			Class.forName(driver);
			
			//Step 2: Connection
			
			String url = property.getProperty("url");
			con= DriverManager.getConnection(url,property);
			System.out.println("Connection done");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
   // Validate the Administrator first;
	public boolean validateAdmin(Employee emp) {
		
		String query= "select password, role from employee where id = ?";
		try {
			ps =con.prepareStatement(query);
		
		ps.setInt(1, emp.getId());
		rs = ps.executeQuery();
		if(rs.next()) {
			if(rs.getString("password").equals(emp.getPassword())&&rs.getString("role").equalsIgnoreCase("admin")) {
				return true;
			}
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// Insert the record into the table
	
	public boolean insertEmployee(Employee emp) {
		String query = "insert into employee(name,salary,phone,doj,password,role) values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, emp.getName());
			ps.setDouble(2,emp.getSalary());
			ps.setLong(3, emp.getPhone());
			ps.setDate(4, emp.getDoj());
			ps.setString(5, emp.getPassword());
			ps.setString(6, emp.getRole());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	// view Employees by id
	
	public Employee viewEmployeeById(int id) {
		String query = "select * from employee where id =?";
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				return new Employee(rs.getInt("id"),rs.getString("name"),rs.getLong("phone"),rs.getDouble("salary"),rs.getDate("doj"),rs.getString("password"),rs.getString("role"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}// View all the employees
	
	public List<Employee>viewAllEmp(){
		List<Employee> data = new ArrayList<Employee>();
		String query = "select * from employee";
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(query);
			
			if(rs.next() != false) {
				do {
					data.add(new Employee(rs.getInt("id"),rs.getString("name"),rs.getLong("phone"),rs.getDouble("salary"),rs.getDate("doj"),rs.getString("password"),rs.getString("role")));
				}
				while(rs.next());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
	
	
	
	
	// Update Employee
	
	public boolean updateEmployee(Employee emp) {
		String query = "update employee set name=?,salary=?,phone=?,doj=?,password=?,role=?";
		try {
			ps = con.prepareStatement(query);
			
			ps.setString(1, emp.getName());
			ps.setDouble(2, emp.getSalary());
			ps.setLong(3, emp.getPhone());
			ps.setDate(4, emp.getDoj());
			ps.setString(5, emp.getPassword());
			ps.setString(6, emp.getRole());
			
			
			
			if(ps.executeUpdate()>0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	


	// Delete the employee
	
	public boolean deleteEmployee(Employee emp) {
		String query = "delete from employee where id = ?";
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, emp.getId());
			
			
			if(ps.executeUpdate()>0) {
				return true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
}
