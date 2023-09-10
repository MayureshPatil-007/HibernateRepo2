package Hibernateonetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country 
{
	@Id
	private int id;
	private String name;
	private int population;
	
	@OneToOne
	private PrimeMinister pm;
	
	public PrimeMinister getPm() {
		return pm;
	}
	public void setPm(PrimeMinister pm) {
		this.pm = pm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
}
