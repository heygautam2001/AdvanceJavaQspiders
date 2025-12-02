package edu.qs.model.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "e_id")
	private Integer id;
	
	@Column(name = "e_name")
	private String name;
	
	@OneToOne(mappedBy = "employee" , cascade = CascadeType.REMOVE)
	private EmployeeProfile empProfile;
	
	@OneToMany(mappedBy = "employee" , cascade = CascadeType.REMOVE)
	private List<Leave> leaves;

	public Employee(String name) {
		super();
		this.name = name;
		
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeProfile getEmpProfile() {
		return empProfile;
	}

	public void setEmpProfile(EmployeeProfile empProfile) {
		this.empProfile = empProfile;
	}

	public List<Leave> getLeaves() {
		return leaves;
	}

	public void setLeaves(List<Leave> leaves) {
		this.leaves = leaves;
	}
	
	
	

}
