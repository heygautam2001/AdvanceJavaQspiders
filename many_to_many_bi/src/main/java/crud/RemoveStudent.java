package crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Student;

public class RemoveStudent {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_many_bi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s1 = em.find(Student.class, 2);
	
	et.begin();
	em.remove(s1);
	et.commit();
}
}
