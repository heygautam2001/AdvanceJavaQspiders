package primaryKeyAutoInc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertUser {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_many_bi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	Users u1 = new Users("Gautam");
	Users u2 = new Users("Yash");
	Users u3 = new Users("Priyanshi");
	Users u4  = new Users("Shivam");
	
	et.begin();
	
	em.persist(u4);
	em.persist(u2);
	em.persist(u3);
	em.persist(u1);
	
	et.commit();
	
}
}
