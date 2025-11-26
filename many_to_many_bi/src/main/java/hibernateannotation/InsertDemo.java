package hibernateannotation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import hibernateannotation.Employees;

public class InsertDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_many_bi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employees e1 = new Employees(1,"Gautam",500000.0);
		Employees e2 = new Employees(2,"Priyanshi",400000.0);
		Employees e3 = new Employees(3,"Ankit",300000.0);
		
		et.begin();
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		
		et.commit();
	
		
	}

}
