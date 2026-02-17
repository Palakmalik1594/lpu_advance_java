package com.mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mapping.Colleges;
import com.mapping.Student;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setStudent_id(101);
		s1.setBranch("CSE");
		s1.setName("palak");
		
		Student s2=new Student();
		s2.setStudent_id(102);
		s2.setBranch("Delhi");
		s2.setName("ece");
		
		Colleges c=new Colleges();
		c.setId(1);
		c.setName("AbC");
		c.setLocation("Delhi");
		c.setPincode("9929");
		
		s1.setCollege(c);
		s2.setCollege(c);
		
		List<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		c.setS(list);
		
		et.begin();
		em.persist(c);
		em.persist(s1);
		em.persist(s2);
		et.commit();
		em.close();
		emf.close();
	}

}
