package com.practice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main1 {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
//	Person p=em.find(Person.class,1);
//	System.out.println(p.getPassport());
	//System.out.println(p);
	
	Passport p=em.find(Passport.class,101);
	System.out.println(p.getPerson());
}
}
