package hibernatedemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CrudOperation 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		System.out.println("Choose Option");
		Scanner sc=new Scanner(System.in);
		System.out.println("1.insert data, 2.fetch data, 3.update data, 4.delete data ");
		
		int opt=sc.nextInt();
		switch(opt)
		{
		case 1:
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Id");
			int id=sc1.nextInt();
			System.out.println("Enter age");
			int age=sc1.nextInt();
			System.out.println("Enter Name");
			String name=sc1.next();
			

			student s=new student();
			s.setId(id);
			s.setAge(age);
			s.setName(name);
			
			et.begin();
			em.merge(s);
			et.commit();
			
			System.out.println("Data Updated Sucessfully");
			break;
			
		case 2:
		{
			System.out.println("Enter Id Of User");
			int id1=sc.nextInt();
			try 
			{
				student e =em.find(student.class,id1);
				System.out.println(e.getId());
				System.out.println(e.getAge());
				System.out.println(e.getName());
			}
			catch (Exception e) 
			{
				System.out.println("Invalid Id");
			}
		}
			break;
			case 3:
			{
				System.out.println("Enter Id");
				int id3=sc.nextInt();
				System.out.println("Enter Student Name");
				int age3=sc.nextInt();
				System.out.println("Enter Student Name");
				String name3=sc.next();
				
				student r=new student();
				r.setId(id3);
				r.setAge(age3);
				r.setName(name3);
				
				et.begin();
				em.merge(r);
				et.commit();
				System.out.println("Data Updated Sucessfully");
			}
			break;
			case 4:
			{
				System.out.println("Enter student Id");
				int id2=sc.nextInt();
				System.out.println("Enter Student Name");
				student f=em.find(student.class, id2);
				et.begin();
				em.persist(f);
				et.commit();
				System.out.println("Data Deleted");
			}
			break;
			default:
				System.out.println("Select Valid Option");
				break;
		}
	}
}

	
		
			
	