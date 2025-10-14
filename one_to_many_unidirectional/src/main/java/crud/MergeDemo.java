package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Player;
import entity.Team;

public class MergeDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_many_uni");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		//create 2 players records
		
		Player p1 = new Player(105,"Bhumra");
		Player p2 = new Player(106,"Hardik");
		
		Team t = em.find(Team.class, 1);
		
		// add the players to the team
		
		t.getPlayers().add(p1);
		t.getPlayers().add(p2);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		
		// merge the team
		em.merge(t);
		
		et.commit();
		
		
	}

}
