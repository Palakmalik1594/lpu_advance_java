package com.mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Subject s1=new Subject();
		s1.setId(101);
		s1.setName("ENglish");
		s1.setNo_of_days(6);
		
		
		Subject s2=new Subject();
		s2.setId(102);
		s2.setName("Maths");
		s2.setNo_of_days(4);
		
		
		Subject s3=new Subject();
		s3.setId(103);
		s3.setName("Webtech");
		s3.setNo_of_days(15);
		
		
		List<Subject> sub=new ArrayList();
		sub.add(s1);
		sub.add(s2);
		sub.add(s3);
		
		
		
		Student ss=new Student();
		ss.setName("palak");
		ss.setGender("female");
		ss.setBranch("csc");
		ss.setSubject(sub);

		Student ss1=new Student();
		ss1.setName("priya");
		ss1.setGender("female");
		ss1.setBranch("ece");
		ss1.setSubject(sub);
		

		Student ss2=new Student();
		ss2.setName("piya");
		ss2.setGender("female");
		ss2.setBranch("ssc");
		ss2.setSubject(sub);
		
		
		
		
		et.begin();

        em.persist(s1);
        em.persist(s2);
em.persist(s3);
        em.persist(ss);
        em.persist(ss1);
        em.persist(ss2);

        et.commit();

        em.close();
        emf.close();

        System.out.println("Data Saved Successfully ✅");

		
		
		
		
		
	}

}
