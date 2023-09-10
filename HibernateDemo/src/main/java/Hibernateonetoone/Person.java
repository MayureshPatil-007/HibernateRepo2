package Hibernateonetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person
{
	@Id
	private int id;
	private String name;
	private long monilenumber;
	
	@OneToOne
	private Aadhar aadhar;

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

	public long getMonilenumber() {
		return monilenumber;
	}

	public void setMonilenumber(long monilenumber) {
		this.monilenumber = monilenumber;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	
	
	
}
