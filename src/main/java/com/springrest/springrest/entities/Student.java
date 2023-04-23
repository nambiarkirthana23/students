package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private long id;
	private String firstname;
	private String Lastname;
	private String email;
	private long yearofGraduation;
	
	public Student(long id, String firstname, String lastname, String email, long yearofGraduation) {
		super();
		this.id = id;
		this.firstname = firstname;
		Lastname = lastname;
		this.email = email;
		this.yearofGraduation = yearofGraduation;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getYearofGraduation() {
		return yearofGraduation;
	}
	public void setYearofGraduation(long yearofGraduation) {
		this.yearofGraduation = yearofGraduation;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", Lastname=" + Lastname + ", email=" + email
				+ ", yearofGraduation=" + yearofGraduation + "]";
	}
	
	
	
	
	

}
