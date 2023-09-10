package Hibernateonetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Country country=new Country();
		country.setId(2);
		country.setName("america");
		country.setPopulation(12454542);
		
		
		PrimeMinister pm=new PrimeMinister();
		pm.setId(2);
		pm.setName("trumph");
		pm.setAge(50);
		pm.setGender("Male");
		pm.setCountry(country);
		country.setPm(pm);
	
		
		et.begin();
		em.persist(pm);
		em.persist(country);
		et.commit();
	}
}
