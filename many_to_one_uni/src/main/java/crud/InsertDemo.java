package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Movie;
import entity.Review;

public class InsertDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_one_uni");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Movie m1 = new Movie(1,"Bhag Milkha Mang");
		
		Review r1 = new Review(101,4.7,"Good Movie",m1);
		Review r2 = new Review(102,4.5,"Greate Movie",m1);
		
		Movie m2 = new Movie(2,"Mikey Virus");
		
		Review r3 = new Review(103,4.7,"Bad Movie",m1);
		Review r4 = new Review(104,4.5,"Wrost Movie",m1);
		
		et.begin();
		em.persist(m1);
		em.persist(m2);
		
		em.persist(r1);
		em.persist(r4);
		em.persist(r3);
		em.persist(r2);
		
		
		et.commit();
		
		
		
		
	}

}
