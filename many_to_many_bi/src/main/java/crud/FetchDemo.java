package crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Student;
import entity.Subject;

public class FetchDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_many_bi");
		EntityManager em = emf.createEntityManager();

		// fetchjing the subjects from Student

		Student s1 = em.find(Student.class, 1);

		List<Subject> subjects = s1.getSubjects();

		for (Subject sub : subjects) {
			System.out.println(sub);
		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

		Subject sub = em.find(Subject.class, 101);

		List<Student> students = sub.getStudents();

		for (Student student : students) {
			System.out.println(student);
		}

	}
}
