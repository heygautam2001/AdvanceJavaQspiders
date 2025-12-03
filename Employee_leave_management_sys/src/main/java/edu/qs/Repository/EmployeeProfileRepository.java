package edu.qs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import edu.qs.model.entity.Employee;
import edu.qs.model.entity.EmployeeProfile;


public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Integer> {
	
	// automatic custom query generation....
	public Employee findByEmailOrPhone(String email, long phone);
	

}
