package crud_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Student;

public class UpdateDemo {
public static void main(String[] args) {
	// step 1 : Load the driver step2 : Establish the connection
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_demo");
		EntityManager em = emf.createEntityManager();// Step: statement/prepare statement.
		
		EntityTransaction et = em.getTransaction();
		
		System.out.println(emf);
		
		// 1 way : By creating a new object
		
		Student s = new Student(3,"Priyanshi Girdhar",80.0);
		
		et.begin();
		em.merge(s);
		et.commit();
		
		// 2 way :  finding and updating
		
		Student s2 = em.find(Student.class, 3);
		
		s.setS_perc(91.0);
		
		et.begin();
		em.merge(s);
		et.commit();
		
		// This will create a new record if not exist
		
		Student s3 = new Student(5,"Ansh",88.0);
		
		et.begin();
		em.merge(s3);
		et.commit();
		
		
		// Merge has two behavior updating the existing record and if not found then create
		// the  new record.
		
}
}
