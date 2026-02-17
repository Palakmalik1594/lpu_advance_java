package com.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Passport p=new Passport();
		p.setId(101);
		p.setName("palak");
		p.setCitizen("Indian");
		p.setDob("23/09/2004");
		
		Person person=new Person();
		person.setId(1);
		person.setName("Allen");
		person.setPassport(p);
		
		p.setPerson(person);
		
		
		et.begin();
		em.persist(person);
		//em.persist(p);
		et.commit();
		
		
		
	}

}
