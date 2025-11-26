package primaryKeyAutoInc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertProduct {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_many_bi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	Product p1 = new Product("Iphone");
	Product p2 = new Product("TV");
	Product p3 = new Product("Irons");
	Product p4 = new Product("Earbuds");
	
	et.begin();
	em.merge(p1);
	em.merge(p2);
	em.merge(p3);
	em.merge(p4);
	et.commit();
}
}
