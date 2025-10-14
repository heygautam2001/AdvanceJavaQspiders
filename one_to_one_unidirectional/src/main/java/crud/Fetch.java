package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Pancard;
import entity.Person;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_uni");
		EntityManager em = emf.createEntityManager();
		
		System.out.println(emf);
		
		Person p1  = em.find(Person.class, 1);
		
		System.out.println(p1);
		
		Pancard p2 = p1.getPan();
		System.out.println(p2);
		
	}

}
