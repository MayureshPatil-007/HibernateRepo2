package hibernatedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchData 

{
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		
		student s=em.find(student.class, 1);
		System.out.println(s.id);
		System.out.println(s.age);
		System.out.println(s.name);
		
		
		
		
	}
	
}
