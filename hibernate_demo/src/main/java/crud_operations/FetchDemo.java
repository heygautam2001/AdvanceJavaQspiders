package crud_operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Student;

public class FetchDemo {
  public static void main(String[] args) {
	// step 1 : Load the driver step2 : Establish the connection
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_demo");
		EntityManager em = emf.createEntityManager();// Step: statement/prepare statement.
		
		Student student = em.find(Student.class , 1);
		
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("student does not exist");
		}
}
}
