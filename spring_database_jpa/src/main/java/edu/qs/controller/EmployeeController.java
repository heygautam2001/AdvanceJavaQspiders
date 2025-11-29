package edu.qs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.qs.model.entity.Employee;

import edu.qs.model.response_structure.ResponseStructure;
import edu.qs.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@PostMapping("/employee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp) {
		boolean result = empService.addEmployee(emp);

		if (result) {
			HttpHeaders hh = new HttpHeaders();
			hh.set("mgs", "sucess");
			return new ResponseEntity<String>("Employee added successfully", HttpStatus.OK);

		}

		HttpHeaders hh = new HttpHeaders();
		hh.set("mgs", "failed");
		return new ResponseEntity<String>("Failed to add employee", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<ResponseStructure<Employee>> findEmployeeById(@PathVariable Integer id) {

		ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
		Employee emp = empService.findEmployeeById(id);

		if (emp != null) {
			rs.setStatus(HttpStatus.FOUND.value());
			rs.setMessage("Data Found");
			rs.setData(emp);

			HttpHeaders hh = new HttpHeaders();
			hh.set("msg", "Data found");

			return new ResponseEntity<ResponseStructure<Employee>>(rs, hh, HttpStatus.FOUND);

		} else {

			rs.setStatus(HttpStatus.NOT_FOUND.value());
			rs.setMessage("Data Not Found");
			rs.setData(null);

			HttpHeaders hh = new HttpHeaders();
			hh.set("msg", "Data not found");

			return new ResponseEntity<ResponseStructure<Employee>>(rs, hh, HttpStatus.NOT_FOUND);

		}

	}

	@GetMapping("/employee")
	public ResponseEntity<ResponseStructure<List<Employee>>> findAllEmployee() {

		ResponseStructure<List<Employee>> rs = new ResponseStructure<>();
		List<Employee> employees = empService.findAllEmployee();

		if (employees != null) {
			rs.setStatus(HttpStatus.FOUND.value());
			rs.setMessage("Data Found");
			rs.setData(employees);

			HttpHeaders hh = new HttpHeaders();
			hh.set("msg", "Data found");

			return new ResponseEntity<ResponseStructure<List<Employee>>>(rs, hh, HttpStatus.FOUND);

		} else {

			rs.setStatus(HttpStatus.NOT_FOUND.value());
			rs.setMessage("Data Not Found");
			rs.setData(null);

			HttpHeaders hh = new HttpHeaders();
			hh.set("msg", "Data not found");

			return new ResponseEntity<ResponseStructure<List<Employee>>>(rs, hh, HttpStatus.NOT_FOUND);

		}

	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<ResponseStructure<String>> deleteEmployeeById(@PathVariable int id) {
		ResponseStructure<String> rs = new ResponseStructure<>();

		boolean deleted = empService.deleteEmployeeById(id);
		if (deleted) {
			rs.setStatus(HttpStatus.OK.value());
			rs.setMessage("Employee deleted successfully");
			rs.setData(null);
			return new ResponseEntity<>(rs, HttpStatus.OK);
		} else {
			rs.setStatus(HttpStatus.NOT_FOUND.value());
			rs.setMessage("Employee deletion  unsuccessfull");
			rs.setData(null);
			return new ResponseEntity<>(rs, HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<ResponseStructure<String>> deleteAllEmployees() {
		ResponseStructure<String> rs = new ResponseStructure<String>();
		boolean deletedAll = empService.deleteAllEmployee();
		if (deletedAll) {
			rs.setMessage("All employees are deleted");
			rs.setStatus(HttpStatus.OK.value());
			rs.setData(null);
			return new ResponseEntity<ResponseStructure<String>>(rs, HttpStatus.OK);
		} else {

			rs.setMessage("Error in deleting all records");
			rs.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			rs.setData(null);
			return new ResponseEntity<ResponseStructure<String>>(rs, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
	
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<ResponseStructure<Employee>> updateEmployee(
	        @PathVariable int id, 
	        @RequestBody Employee newEmpData) {

	    ResponseStructure<Employee> rs = new ResponseStructure<>();

	    boolean updated = empService.updateEmployeeById(id, newEmpData);

	    if (updated) {
	        rs.setStatus(HttpStatus.OK.value());
	        rs.setMessage("Employee updated successfully");
	        rs.setData(newEmpData);
	        return new ResponseEntity<>(rs, HttpStatus.OK);
	    } else {
	        rs.setStatus(HttpStatus.NOT_FOUND.value());
	        rs.setMessage("Employee not found");
	        rs.setData(null);
	        return new ResponseEntity<>(rs, HttpStatus.NOT_FOUND);
	    }
	}
	
	
	@PatchMapping("/employees/{id}")
	public ResponseEntity<ResponseStructure<Employee>> updateEmployeePartial(
	        @PathVariable int id,
	        @RequestBody Employee newData) {

	    ResponseStructure<Employee> rs = new ResponseStructure<>();
	    Employee updatedEmployee = empService.updateEmployeePartial(id, newData);

	    if (updatedEmployee != null) {
	        rs.setStatus(HttpStatus.OK.value());
	        rs.setMessage("Employee updated successfully");
	        rs.setData(updatedEmployee);
	        return new ResponseEntity<>(rs, HttpStatus.OK);
	    } else {
	        rs.setStatus(HttpStatus.NOT_FOUND.value());
	        rs.setMessage("Employee not found");
	        rs.setData(null);
	        return new ResponseEntity<>(rs, HttpStatus.NOT_FOUND);
	    }
	}



}
