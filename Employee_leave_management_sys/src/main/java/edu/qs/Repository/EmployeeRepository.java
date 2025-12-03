package edu.qs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import edu.qs.model.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	

}
