package crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Movie;
import entity.Review;

public class RemoveMovie {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_one_uni");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		// remove the movie with id 2;
		
		Movie remObj = em.find(Movie.class, 2);
		
		Query query = em.createQuery("select r from Review r where r.m.m_id = 2");
		
		
		List<Review> reviews = query.getResultList();
		
		et.begin();
		for(Review r : reviews) {
			r.setM(null);
			
			em.merge(r);
		}
		
		em.remove(remObj);
		
		et.commit();
	}

}
