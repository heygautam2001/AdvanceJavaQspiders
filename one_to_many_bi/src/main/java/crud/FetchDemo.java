package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Player;
import entity.Team;

public class FetchDemo {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_many_bi");
	EntityManager em = emf.createEntityManager();
	
	//Fetch the player from team
	Team t = em.find(Team.class,2);
	List<Player> players = t.getPlayers();
	for(Player p : players) {
		System.out.println(p);
	}
	
	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
	// fetch the team from Player
	
	Player p = em.find(Player.class, 103);
	Team t2 = p.getTeam();
	System.out.println(t2);
	
}
}
