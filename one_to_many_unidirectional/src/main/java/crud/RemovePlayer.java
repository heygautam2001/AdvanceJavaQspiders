package crud;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Player;
import entity.Team;

public class RemovePlayer {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_many_uni");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		// remove the player with id 102

		Player rObj = em.find(Player.class, 102);

		Query query = em.createQuery("select t from Team t");
		List<Team> teams = query.getResultList();

		for (Team t : teams) {
			Iterator<Player> itr = t.getPlayers().iterator();

			while (itr.hasNext()) {
				Player temp = itr.next();

				if (temp.getP_id() == rObj.getP_id()) {
					itr.remove();
					break;
				}
			}

		}

		et.begin();
		for (Team t : teams) {
			em.merge(t);
		}

		et.commit();

	}
}
