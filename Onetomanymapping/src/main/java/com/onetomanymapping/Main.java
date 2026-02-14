package com.onetomanymapping;

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
	
	Students s1=new Students();
	s1.setStudent_id(103);
	s1.setBranch("CSE");
	s1.setName("palak");
	
	Students s2=new Students();
	s2.setStudent_id(104);
	s2.setBranch("Delhi");
	s2.setName("ece");
	
	Colleges c=new Colleges();
	c.setId(3);
	c.setName("AbC");
	c.setLocation("Delhi");
	c.setPincode("9929");
	
	List<Students> list=new ArrayList();
	list.add(s2);
	list.add(s1);
	c.setS(list);
	
	et.begin();
	em.persist(c);
	em.persist(s1);
	em.persist(s2);
	et.commit();
	
	
	
	
}
}
