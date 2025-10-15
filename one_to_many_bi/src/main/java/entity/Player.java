package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Player {
	@Id
	private Integer p_id;
	private String p_name;

	@ManyToOne
	@JoinColumn
	private Team team;

	public Player() {

	}

	public Player(Integer p_id, String p_name, Team team) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.team = team;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [p_id=" + p_id + ", p_name=" + p_name + "]";
	}

}
