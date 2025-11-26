package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private Integer s_id;

	private String s_name;

	@ManyToMany
	@JoinColumn
	List<Subject> subjects;

	public Student() {

	}

	public Student(Integer s_id, String s_name, List<Subject> subjects) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.subjects = subjects;
	}

	public Integer getS_id() {
		return s_id;
	}

	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + "]";
	}

}
