package controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.EmployeeDao;
import model.entities.Employee;

public class EmployeeController {
	
	EmployeeDao dao = new EmployeeDao();
	Scanner sc = new Scanner(System.in);
	
	
	// inserting the employee;
	
	public boolean insertEmployee() {
		System.out.println("Enter the name: ");
		String name= sc.nextLine();
		
		System.out.println("Enter the salary: ");
		Double salary= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the phone: ");
		Long phone= sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter the doj: ");
		String doj= sc.nextLine();
		Date doj1 = Date.valueOf(doj);
		
		//for password
		String password= name+1234;
		
		System.out.println("Enter the role: ");
		String role= sc.nextLine();
		
		Employee emp= new Employee(name,salary,phone,doj1,password,role);
		return dao.insertEmployee(emp);
		
		
	}
	
	// View the employee by id
	
	public Employee viewEmployeeById() {
		System.out.println("Enter the id: ");
		Integer id = sc.nextInt();
		sc.nextLine();
		
		return dao.viewEmployeeById(id);
	}
	
	// view all the employee...
	
	public List<Employee> viewAllEmp(){
		return dao.viewAllEmp();
	}
	
	// validate the admin.
	
	public boolean validateAdmin() {
		System.out.println("Enter the id: ");
		Integer id =  sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the password: ");
		String password = sc.nextLine();
		
		Employee emp= new Employee();
		emp.setId(id);
		emp.setPassword(password);
		
		return dao.validateAdmin(emp);
	}
	
	public boolean updateEmployee() {
		Employee emp=viewEmployeeById();
		
		if(emp != null) {
			System.out.println(emp);
			
			System.out.println("Enter the name to update or press enter ");
			String name = sc.nextLine();

			System.out.println("Enter the salary to update or press enter ");
			String salary = sc.nextLine();

			System.out.println("Enter the phone to update or press enter ");
			String phone = sc.nextLine();

			System.out.println("Enter the doj to update or press enter ");
			String doj = sc.nextLine();

			System.out.println("Enter the password to update or press enter ");
			String password = sc.nextLine();

			System.out.println("Enter the role to update or press enter ");
			String role = sc.nextLine();
			
			if(!name.isEmpty()) {
				emp.setName(name);
			}
			
			if(!salary.isEmpty()) {
				emp.setName(salary);
			}
			
			if(!phone.isEmpty()) {
				emp.setName(phone);
			}
			
			if(!doj.isEmpty()) {
				emp.setName(doj);
			}
			
			if(!password.isEmpty()) {
				emp.setName(password);
			}
			
			if(!role.isEmpty()) {
				emp.setName(role);
			}
			return dao.updateEmployee(emp);
		}
		return false;
	}

	public static void main(String[] args) {
		

		EmployeeController controller = new EmployeeController();
//		System.out.println(controller.validateAdmin());
//		System.out.println(controller.insertEmployee());
//    	System.out.println(controller.viewEmployeeById());
		System.out.println(controller.viewAllEmp());
//		System.out.println(controller.updateEmployee());
	}

}
