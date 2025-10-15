package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Player;
import entity.Team;

public class InsertDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_many_bi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Team t1 = new Team(1,"MI");
		Player p1 = new Player(101,"Rohit",t1);
		Player p2 = new Player(102,"hardik",t1);
		Player p3 = new Player(105,"surya",t1);
		Player p4 = new Player(106,"Tilak",t1);
		
		Team t2 = new Team(2,"RCB");
		Player p5 = new Player(103,"Virat",t2);
		Player p6 = new Player(104,"Bhuvi",t2);
		Player p7 = new Player(107,"Faf dupl",t2);
		Player p8 = new Player(108,"Maxwell",t2);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		em.persist(p6);
		em.persist(p7);
		em.persist(p8);
		em.persist(t1);
		em.persist(t2);
		
		et.commit();
		
		
		
		
		
		
	   
	}

}
