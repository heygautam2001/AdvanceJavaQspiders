package http_session;

public class User {
	private String name;
	private String dob;
	private String email;
	private Long phone;
	
	
	


	public User(String name, String dob, String email, Long phone) {
		super();
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getPhone() {
		return phone;
	}


	public void setPhone(Long phone) {
		this.phone = phone;
	}
	
	

}
