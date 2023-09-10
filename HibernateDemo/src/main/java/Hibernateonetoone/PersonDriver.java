package Hibernateonetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person person=new Person();
		person.setId(1);
		person.setMonilenumber(1234567890);
		person.setName("Mayuresh");
		
		Aadhar aadhar=new Aadhar();
		aadhar.setId(1);
		aadhar.setNumber(1454798987);
		aadhar.setAddress("Karvenagar,Pune");
		
		person.setAadhar(aadhar);
		
		et.begin();
		em.persist(person);
		em.persist(aadhar);
		et.commit();
		
		System.out.println("Data Fetch Successfully");
	}
}
