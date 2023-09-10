package hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		
		System.out.println("Enter Employee age");
		int age=sc.nextInt();
		
		System.out.println("Enter Employee name");
		String name=sc.next();
		
		Employee e=new Employee();
		
		e.setId(id);
		e.setAge(age);
		e.setName(name);
		
		et.begin();
		em.persist(e);
		et.commit();
		
		
		
		
		}	
		
	}
}
