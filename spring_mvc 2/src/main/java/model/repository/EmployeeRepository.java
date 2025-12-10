package model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
