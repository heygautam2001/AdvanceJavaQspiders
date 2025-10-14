package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private Integer m_id;
	private String m_name;

	public Movie() {

	}

	public Movie(Integer m_id, String m_name) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
	}

	@Override
	public String toString() {
		return "Movie [m_id=" + m_id + ", m_name=" + m_name + "]";
	}

	public Integer getM_id() {
		return m_id;
	}

	public void setM_id(Integer m_id) {
		this.m_id = m_id;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

}
