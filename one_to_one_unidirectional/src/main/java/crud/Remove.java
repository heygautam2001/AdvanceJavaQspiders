package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Pancard;
import entity.Person;

public class Remove {
	public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_uni");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
    System.out.println(emf);
    
    Pancard pan = em.find(Pancard.class, 102);
    Query query = em.createQuery("select p from Person p where p.pan.pan_id = 102");
    
    
   Person p = (Person)query.getSingleResult();
    p.setPan(null);
    et.begin();
    
    em.merge(p);
    em.remove(pan);
    
    et.commit();
    
}
}