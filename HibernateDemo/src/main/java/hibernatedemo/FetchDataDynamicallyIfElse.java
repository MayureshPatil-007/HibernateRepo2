package hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDataDynamicallyIfElse 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID");
		int id=sc.nextInt();
		System.out.println();
		student s=em.find(student.class, id);
//		try 
//		{
//			System.out.println(s.getId());
//			System.out.println(s.getAge());
//			System.out.println(s.name);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Invalid Id");
//		}
		
		if(s!=null)
		{
			
			System.out.println(s.getId());
			System.out.println(s.getAge());
			System.out.println(s.name);
		}
		else
		{
			System.out.println("Invalid Id");
		}
		
		
	}
}
