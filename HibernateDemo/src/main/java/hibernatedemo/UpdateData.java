package hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		student s=new student();
		s.setId(6);
		s.setAge(26);
		s.setName("babu");
		
		et.begin();
		em.merge(s);
		et.commit();
		
		System.out.println("Data Updated Sucessfully");
		
		
		s.setId(5);
		s.setAge(27);
		s.setName("shona");
		
		et.begin();
		em.merge(s);
		et.commit();
		System.out.println("Data Sucessfully Added");
	}
}
