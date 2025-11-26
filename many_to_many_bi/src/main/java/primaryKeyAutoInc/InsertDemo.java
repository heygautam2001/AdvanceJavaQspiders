package primaryKeyAutoInc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDemo {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_many_bi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Employee emp1 = new Employee("Gautam");
	Employee emp2 = new Employee("Yash");
	Employee emp3 = new Employee("Priynshi");
	Employee emp4 = new Employee("Ankit");
	
	et.begin();
	em.persist(emp4);
	em.persist(emp3);
	em.persist(emp2);
	em.persist(emp1);
	et.commit();
	
}
}
