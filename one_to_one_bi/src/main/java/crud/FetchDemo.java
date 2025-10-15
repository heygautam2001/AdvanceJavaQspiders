package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Pancard;
import entity.Person;

public class FetchDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_bi");
		EntityManager em = emf.createEntityManager();
		
		//Fetching pancard from person
		Person p1 =em.find(Person.class, 1);
		System.out.println(p1);
		Pancard pan1 = p1.getPan();
		System.out.println(pan1);
		
		System.out.println("================================");
		
		//fetching the person from pancard
		
		Pancard pan2 = em.find(Pancard.class , 102);
		System.out.println(pan2);
		Person p2 = pan2.getP();
		System.out.println(p2);
		
	}

}
