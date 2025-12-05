package edu.qs.controller;

public class Student {
	
	private Integer id;
	private String name;
	private String email;
	private Long phone;
	private String dob;
	private String gender;
	private String country;
	private String[] skills;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(Integer id, String email, String name, Long phone, String dob, String gender, String country,
			String[] skills) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
		this.country = country;
		this.skills = skills;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String[] getSkills() {
		return skills;
	}


	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	
	

}
