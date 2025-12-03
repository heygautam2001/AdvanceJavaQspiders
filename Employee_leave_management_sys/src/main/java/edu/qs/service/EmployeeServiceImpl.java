package edu.qs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.qs.Repository.EmployeeRepository;
import edu.qs.model.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empRepo.save(emp);
		return true;
		
	}
	
	
	

}
