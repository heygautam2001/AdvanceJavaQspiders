package crud;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Student;
import entity.Subject;

public class RemoveSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_many_bi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		// Remove the subject with id 102
		Subject remObj = em.find(Subject.class, 102);
		
		List<Student> students = remObj.getStudents();
		
		for(Student stud : students) {
			Iterator<Subject> itr= stud.getSubjects().iterator();
			
			while(itr.hasNext()) {
				Subject temp = itr.next();
				if(temp.getSub_id() == remObj.getSub_id()) {
					itr.remove();
					break;
				}
			}
			
		et.begin();
		for(Student s : students) {
			em.merge(s);
		}
		em.remove(remObj);
		et.commit();
			
		}
	}

}
