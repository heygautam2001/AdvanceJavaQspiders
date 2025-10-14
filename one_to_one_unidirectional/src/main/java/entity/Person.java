package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int p_id;
	private String p_name;
	
	@OneToOne
	private Pancard pan;
	
	public Person() {
		
		
	}

	public Person(int p_id, String p_name, Pancard pan) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.pan = pan;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public Pancard getPan() {
		return pan;
	}

	public void setPan(Pancard pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", p_name=" + p_name + ", pan=" + pan + "]";
	}
	
	
	
	
	
	

}
