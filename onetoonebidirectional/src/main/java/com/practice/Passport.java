package com.practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	private int id;
	
	private String name;
	private String dob;
	private String citizen;
	
	@OneToOne(mappedBy = "passport")  //jis side remove krna h usme lgayenge,this will remove in passport
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + name + ", dob=" + dob + ", citizen=" + citizen + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCitizen() {
		return citizen;
	}
	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}
	

}
