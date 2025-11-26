package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.student.Student;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//get-student 106
		 Student student1 =(Student)session.load(Student.class, 105);
		 System.out.println(student1);
		 
		 Student student2 =(Student)session.load(Student.class, 104);
		 System.out.println(student2);
		 
		 
		 Student student3 =(Student)session.get(Student.class, 104);
		 System.out.println(student3.getCity()+" "+student3.getName());
		 
		 
		 Student student4 =(Student)session.get(Student.class, 103);
		 System.out.println(student4.getCity()+" "+student4.getName());
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
