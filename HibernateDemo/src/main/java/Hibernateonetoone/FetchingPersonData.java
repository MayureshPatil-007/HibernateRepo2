package Hibernateonetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchingPersonData 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		
		Person person=em.find(Person.class, 1);
		System.out.println("Id :-"+person.getId());
		System.out.println("name :-"+person.getName());
		System.out.println("Mobile Number :-"+person.getMonilenumber());
		
		System.out.println("----------------------------------------------------------");
		
		Aadhar aadhar=person.getAadhar();
		System.out.println("Aadhar Id :-"+aadhar.getId());
		System.out.println("Aadhar Number :-"+aadhar.getNumber());
		System.out.println("Address :-"+aadhar.getAddress());
		
		
	}
}
