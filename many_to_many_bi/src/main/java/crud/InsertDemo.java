package crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Student;
import entity.Subject;

public class InsertDemo {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_many_bi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Subject s1 = new Subject(101,"Physics");
	Subject s2 = new Subject(102,"Chemistry");
	Subject s3 = new Subject(103,"Mathematics");
	Subject s4= new Subject(104,"Biology");
	
	List<Subject> subs1 = new ArrayList<>();
	subs1.add(s1);
	subs1.add(s2);
	subs1.add(s3);
	subs1.add(s4);
	
	Student stud1 = new Student(1,"Gautam",subs1);
	
	
	List<Subject> subs2 = new ArrayList<>();
	subs2.add(s1);
	subs2.add(s2);
	subs2.add(s3);
	subs2.add(s4);
	
	Student stud2 = new Student(2,"Yash",subs2);

	
	et.begin();
	em.persist(s1);
	em.persist(s2);
	em.persist(s3);
	em.persist(s4);
	
	em.persist(stud1);
	em.persist(stud2);
	et.commit();
	
	
	
	
}
}
