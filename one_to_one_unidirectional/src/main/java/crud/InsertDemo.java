package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Pancard;
import entity.Person;

public class InsertDemo {
  public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_uni");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	System.out.println(emf);
	Pancard pan1 = new Pancard(101,"Delhi");
    Person p1 = new Person(1,"Aryan",pan1);
    
    Pancard pan2 = new Pancard(102,"odisha");
    Person p2 = new Person(2,"Ridra",pan2);
	
	et.begin();
	
	em.persist(pan1);
	em.persist(pan2);
	em.persist(p1);
	em.persist(p2);
	
	et.commit();
	
}
}
