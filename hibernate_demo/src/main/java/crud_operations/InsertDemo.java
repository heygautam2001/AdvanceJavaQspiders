package crud_operations;

import java.util.Date;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Address;
//import entity.Student;

public class InsertDemo {
public static void main(String[] args) {
	
	// step 1 : Load the driver step2 : Establish the connection
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_demo");
	EntityManager em = emf.createEntityManager();// Step: statement/prepare statement.
	EntityTransaction et = em.getTransaction();
	
	System.out.println(emf);
	
	
//	Student s1 = new Student(1,"Gautam",71.0);
//	Student s2 = new Student(2,"Ankit",70.0);
//	Student s3 = new Student(3,"Priyanshi",76.0);
//	Student s4 = new Student(4,"Yash",86.0);
//	
//	et.begin();
//	
//	em.persist(s1);
//	em.persist(s2);
//	em.persist(s3);
//	em.persist(s4);
//	
//	et.commit();
	
	Address ad = new Address();
	ad.setStreet("street1");
	ad.setCity("New Delhi");
	ad.setOpen(true);
	ad.setX(4.55);
	ad.setAddedDate(new Date());
	System.out.println(ad);
	
	
	et.begin();
	em.persist(ad);
	et.commit();
	
	

	
}
}
