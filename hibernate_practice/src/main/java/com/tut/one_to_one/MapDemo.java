package com.tut.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating question
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is java");

		// creating answer
		Answer ans = new Answer();
		ans.setAnswerId(343);
		ans.setAnswer("java is programming language");

		q1.setAnswer(ans);
		
		
		Question q2 = new Question();
		q2.setQuestionId(242);
		q2.setQuestion("What is collection Framework");

		// creating answer
		Answer ans1 = new Answer();
		ans1.setAnswerId(344);
		ans1.setAnswer("Api to work with objects in java");

		q2.setAnswer(ans1);

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
         session.save(q1);
         session.save(q2);
         session.save(ans);
         session.save(ans1);
         
		tx.commit();

		factory.close();

	}

}
