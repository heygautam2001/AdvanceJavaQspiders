package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Player;
import entity.Team;

public class RemoveTeam {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_many_bi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	// remove the team from id 2
	 Team t =  em.find(Team.class, 2);
	 
	 List<Player> players = t.getPlayers();
	 
	 et.begin();
	 
	 for(Player p : players) {
		 p.setTeam(null);
		 em.merge(p);
	 }
	 
	 em.remove(t);
	 et.commit();
			
}
}