import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_cache");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee1 e1 = new Employee1(1,"Priyanshi Girdhar",250000.0);
		System.out.println(e1);
		
		Employee1 e2 = new Employee1(2,"Ankit Girdhar",350000.0);
		
		
		Employee1 e3 = new Employee1(3,"Gatam Girdhar",450000.0);
		
		
		
		
		
		
		
		
	}

}
