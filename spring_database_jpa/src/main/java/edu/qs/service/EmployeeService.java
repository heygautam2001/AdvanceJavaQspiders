package edu.qs.service;

import java.util.List;

import edu.qs.model.entity.Employee;

public interface EmployeeService {

	public boolean addEmployee(Employee emp);

	public Employee findEmployeeById(int id);

	public List<Employee> findAllEmployee();

	public boolean deleteEmployeeById(int id);

	public boolean deleteAllEmployee();
	
	public boolean updateEmployeeById(int id,Employee emp);
	
	public Employee updateEmployeePartial(int id, Employee newData);
		
	

}
