package test;

import java.util.Date;

public class Customer {

	private int id;
	private String name;
	boolean sex;
	Date dob;
	
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
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	public Customer() {
		super();
	}
	public Customer(int id, String name, boolean sex, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.dob = dob;
	}
	
	
	
	
	
	
}
