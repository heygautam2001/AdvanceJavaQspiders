package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Movie;
import entity.Review;

public class FetchDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_one_uni");
		EntityManager em = emf.createEntityManager();
		
		Review r1 =  em.find(Review.class, 101);
		System.out.println(r1);
		
		
		Movie m = r1.getM();
		
		System.out.println(m);
		
		
	}

}
