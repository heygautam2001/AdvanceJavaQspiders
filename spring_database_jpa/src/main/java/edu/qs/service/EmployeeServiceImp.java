package edu.qs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import edu.qs.model.entity.Employee;
import edu.qs.model.repository.EmployeeRepository;

@Service
@Primary
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	
   // Add an employee==============================
	@Override
	public boolean addEmployee(Employee emp) {
		Employee newEmp = empRepo.save(emp);

		if (newEmp.getId() != null) {
			return true;
		}
		return false;
	}
	
	
   // find Employee by an id ====================================================
	public Employee findEmployeeById(int id) {
		Optional<Employee> emp = empRepo.findById(id);
		if (emp.isPresent()) {
			return emp.get();
		}
		return null;

	}
    
	
	// find all Employee =====================================================
	public List<Employee> findAllEmployee() {
		Optional<List<Employee>> employees = Optional.ofNullable(empRepo.findAll());
		if (employees.isPresent()) {
			return employees.get();
		}
		return null;
	}

	// delete employee by id ===================================================
	public boolean deleteEmployeeById(int id) {

		Optional<Employee> emp = empRepo.findById(id);

		if (emp.isPresent()) {
			empRepo.deleteById(id);
			return true;
		}
		return false;

	}
	
	// deleteAll Employees ====================================================

	public boolean deleteAllEmployee() {
		List<Employee> employees = empRepo.findAll();
		if (!employees.isEmpty()) {
			empRepo.deleteAll();
			return true;
		}

		return false;

	}
    
	// Update employee by id==================================
	public boolean updateEmployeeById(int id, Employee newData) {
		Optional<Employee> optional = empRepo.findById(id);

		if (optional.isPresent()) {
			Employee existing = optional.get();

			// Update fields
			existing.setName(newData.getName());
			existing.setSalary(newData.getSalary());
			existing.setDepartment(newData.getDepartment());

			empRepo.save(existing);
			return true;
		}

		return false; // Employee not found
	}
	
	// partially update an employee================================== 
	public Employee updateEmployeePartial(int id, Employee newData) {
	    Optional<Employee> optional = empRepo.findById(id);

	    if (optional.isPresent()) {
	        Employee existing = optional.get();

	        // Update only fields that are not null
	        if (newData.getName() != null) {
	            existing.setName(newData.getName());
	        }

	        if (newData.getSalary() != null) {   // If salary is Integer in entity
	            existing.setSalary(newData.getSalary());
	        }

	        if (newData.getDepartment() != null) {
	            existing.setDepartment(newData.getDepartment());
	        }

	        return empRepo.save(existing);
	    }

	    return null;  // Not found
	}
	
	


}
