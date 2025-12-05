package edu.qs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.qs.Repository.EmployeeRepository;
import edu.qs.Repository.LeaveRepository;
import edu.qs.model.entity.Employee;
import edu.qs.model.entity.Leave;
import edu.qs.model.global_custom_exception.EmployeeNotFoundException;

@Service
public class LeaveServiceImpl implements LeaveService {
	@Autowired
	LeaveRepository leaveRepo;

	@Autowired
	EmployeeRepository empRepo;

	@Override
	public boolean addLeave(Integer id, Leave leave) {
		// TODO Auto-generated method stub

		Optional<Employee> opt = empRepo.findById(id);

		if (opt.isPresent()) {

			Leave newLeave = leaveRepo.save(leave);

			if (newLeave != null) {
				return true;
			}

		} else {
			
			throw new EmployeeNotFoundException("Employee with id " + id + " does not found");
			
		}
		
          return false;
          
     }

}
