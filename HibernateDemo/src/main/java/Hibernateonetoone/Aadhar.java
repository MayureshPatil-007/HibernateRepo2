package Hibernateonetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aadhar 
{
	@Id
	private int id;
	private long number;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
