package hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveData 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	
		student s=em.find(student.class, 1);
		em.find(student.class, 1);
		et.begin();
		em.remove(s);
		et.commit();
		
		System.out.println("Data Sucessfully Removed ");
	}
}
