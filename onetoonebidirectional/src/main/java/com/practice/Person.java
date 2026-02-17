package com.practice;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
@JoinColumn   //jis side column chahiye uss taraf join 
	private int id;
	@OneToOne(cascade =CascadeType.ALL)
	private Passport passport;
	@Override
	public String toString() {
		return "Person [id=" + id + ", passport=" + passport + ", name=" + name + "]";
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
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
	private String name;

}
