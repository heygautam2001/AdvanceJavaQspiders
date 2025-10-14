package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Team;

public class RemoveTeam {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_many_uni");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Team rObj = em.find(Team.class, 2);

		Query query = em.createQuery("select t from Team t where t.t_id = 2");

		Team t = (Team) query.getSingleResult();

		et.begin();
		em.remove(t);
		et.commit();

	}

}
