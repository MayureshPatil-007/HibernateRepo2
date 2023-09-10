package hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		student s = new student();
		
		
		s.setId(1);
		s.setAge(23);
		s.setName("Mayuresh");
		
		s.setId(2);
		s.setAge(23);
		s.setName("Mayuresh");

		
		et.begin();
		em.persist(s);
		et.commit();
		
		System.out.println("Data Saved");
		
	}
}
