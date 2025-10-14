package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Player;
import entity.Team;

public class FetchDemo {
	public static void main(String[] args) {
		

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_many_uni");
	EntityManager em = emf.createEntityManager();
	
	// fetch the players from the team
	
	Team t = em.find(Team.class, 1);
	System.out.println(t);
	
	List<Player> players = t.getPlayers();
	
	for(Player p : players) {
		System.out.println(p);
	}

}
}