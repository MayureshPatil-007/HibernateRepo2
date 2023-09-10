package hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;

public class DynamicInputStudentTableLoop
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
 
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) 
		{
			System.out.println("Enter Id");
			int id=sc.nextInt();
			
			System.out.println("Enter Age");
			int age=sc.nextInt();
			
			System.out.println("Enter Name");
			String name=sc.next();
		
			student s = new student();
		
		System.out.println("Enter Id");
		s.setId(sc.nextInt());
		System.out.println("Enter Age");
		s.setAge(sc.nextInt());
		System.out.println("Enter Name");
		s.setName(sc.next());
		
		et.begin();
		em.persist(s);
		et.commit();
		
		System.out.println("Data Saved");
		}
	}
}


