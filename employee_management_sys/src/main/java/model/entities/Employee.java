package model.entities;

import java.sql.Date;

public class Employee {
	
  private Integer id;
  private String name;
  private Double salary;
  private Long phone;
  private Date doj;
  private String password;
  private String role;
  
  public Employee() {
	  
  }
  
public Employee(Integer id, String name, Long phone ,Double salary, Date doj, String password, String role) {
	this(name , salary , phone, doj ,password,role);
	this.id = id;
	
}

public Employee(String name, Double salary, Long phone, Date doj, String password, String role) {

	this.name = name;
	this.salary = salary;
	this.phone = phone;
	this.doj = doj;
	this.password = password;
	this.role = role;
	
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

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}


public Long getPhone() {
	return phone;
}

public void setPhone(Long phone) {
	this.phone = phone;
}

public Date getDoj() {
	return doj;
}

public void setDoj(Date doj) {
	this.doj = doj;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary +", phone = "+phone+ ", doj=" + doj + ", password=" + password
			+ ", role=" + role + "]";
}

}

