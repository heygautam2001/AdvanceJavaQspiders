package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {
	@Id
	private int t_id;
	private String t_name;

	@OneToMany
	private List<Player>players;

	public Team() {

	}

	public Team(int t_id, String t_name, List<Player> players) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.players = players;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [t_id=" + t_id + ", t_name=" + t_name + ", players=" + players + "]";
	}

}
