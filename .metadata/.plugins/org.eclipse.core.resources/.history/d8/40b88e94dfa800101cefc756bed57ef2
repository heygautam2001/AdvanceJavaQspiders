package crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import entity.Player;
import entity.Team;

public class InsertDemo {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_many_uni");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Player p1 = new Player(101, "Rohit");
		Player p2 = new Player(102, "suryaKumar Yadav");

		List<Player> player1 = new ArrayList<Player>();
		player1.add(p1);
		player1.add(p2);

		Team t1 = new Team(1, "MI", player1);

		Player p3 = new Player(103, "Virat Kohli");
		Player p4 = new Player(104, "Bhuvi Kumar");

		List<Player> player2 = new ArrayList<Player>();
		player2.add(p3);
		player2.add(p4);

		Team t2 = new Team(2, "RCB", player2);

		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(t1);
		em.persist(t2);

		et.commit();

	}

}