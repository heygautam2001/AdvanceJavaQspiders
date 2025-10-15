package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Person;

public class RemovePerson {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_bi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Person p = em.find(Person.class, 2);
	
	et.begin();
	em.remove(p);
	et.commit();
}
}
