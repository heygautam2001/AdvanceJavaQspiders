package edu.qs.model.entity;

import java.time.LocalDate;

import edu.qs.model.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Leave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "l_id")
	private Integer id;
	
	@Column(name = "start_date")
	private LocalDate sDate;
	
	@Column(name = "end_id")
	private LocalDate eDate;
	
	@Column(name = "l_status")
	private Status status;
	
	@ManyToOne
	@JoinColumn
	private Employee employee;
	
	public Leave() {
		// TODO Auto-generated constructor stub
	}

	public Leave(LocalDate sDate, LocalDate eDate, Status status, Employee employee) {
		super();
		this.sDate = sDate;
		this.eDate = eDate;
		this.status = status;
		this.employee = employee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getsDate() {
		return sDate;
	}

	public void setsDate(LocalDate sDate) {
		this.sDate = sDate;
	}

	public LocalDate geteDate() {
		return eDate;
	}

	public void seteDate(LocalDate eDate) {
		this.eDate = eDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
