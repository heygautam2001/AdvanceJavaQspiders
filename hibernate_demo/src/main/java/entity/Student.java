package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
	private int id;
	private String name;
	private double s_perc;
	
	public Student() {
		
		
	}
	
	public Student(int id, String name, double s_perc) {
		super();
		this.id = id;
		this.name = name;
		this.s_perc = s_perc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getS_perc() {
		return s_perc;
	}

	public void setS_perc(double s_perc) {
		this.s_perc = s_perc;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", s_perc=" + s_perc + "]";
	}
	
	
	
}
