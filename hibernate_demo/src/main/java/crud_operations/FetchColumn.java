package crud_operations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchColumn {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_demo");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("Select s.name from Student s");
		
		List<String> names =query.getResultList();
		
		for(String name : names) {
			System.out.print(name+" ");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Query query2 = em.createQuery("select s.s_perc from Student s");
		
		List<Double> percentage = query2.getResultList();
		
		for(Double perc : percentage) {
			System.out.print(perc+" ");
		}
		
		System.out.println("======================================================");
		
		Query query3 = em.createQuery("select s.name,s.s_perc from Student s");
		
		List<Object[]> data = query3.getResultList();
		
		for(Object [] obj : data) {
			String name = (String)obj[0];
			Double perc = (Double)obj[1];
			System.out.println(name+" "+perc);
		}
		
		
	}

}
