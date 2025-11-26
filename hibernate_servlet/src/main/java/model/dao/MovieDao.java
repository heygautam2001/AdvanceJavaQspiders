package model.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.entity.Movie;

public class MovieDao {

	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction et;
	Query query;

	public MovieDao() {
		emf = Persistence.createEntityManagerFactory("hibernate_webDemo");
		em = emf.createEntityManager();
		et = em.getTransaction();

	}
	// ======================================================================//

	public int movieCount() {

		String q = "select m from Movie m";
		query = em.createQuery(q);

		List<Movie> movie = query.getResultList();

		return movie.size();
	}

	// =====================================================================//

	public boolean addMovie(Movie m) {

		int oldCount = movieCount();

		et.begin();
		em.persist(m);
		et.commit();

		int newCount = movieCount();

		if (newCount > oldCount) {
			return true;
		}
		return false;
	}

	// =================================================================//

	public Movie findMovieById(int id) {

		return em.find(Movie.class, id);
	}
	
	//=================================================================================================

	public List<Movie> findAllMovie() {
	    String q = "select m from Movie m";
	    Query query = em.createQuery(q);

	    List<Movie> movieList = query.getResultList();

	    // ✅ Safety check
	    if (movieList == null) {
	        movieList = new ArrayList<>();
	    }

	    return movieList;
	}

	
	//=================================================================================================

	public void updateMovie(Movie m) {

		et.begin();
		em.merge(m);
		et.commit();
		

	}

//	public void updateMovie(Movie m) {
//		// TODO Auto-generated method stub
//		
//	}

}
