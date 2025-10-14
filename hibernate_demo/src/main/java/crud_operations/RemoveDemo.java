package crud_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Student;

public class RemoveDemo {
	public static void main(String[] args) {
		// step 1 : Load the driver step2 : Establish the connection
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_demo");
				EntityManager em = emf.createEntityManager();// Step: statement/prepare statement.
				
				EntityTransaction et = em.getTransaction();
				
				System.out.println(emf);
				
				// finding the object and then  remove
				
				Student s = em.find(Student.class , 5);
				
				et.begin();
				em.remove(s);
				et.commit();
				
				// we cannot remove by creating new object
				
				Student s1 = new Student(5,"Priyanshi Girdhar",80.0);
				
				et.begin();
				em.remove(s1);
				et.commit();
	}

}
