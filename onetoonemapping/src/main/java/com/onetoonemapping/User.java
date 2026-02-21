package com.onetoonemapping;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class User {
	public static void main(String[] args) {
	 FindCarById();
//	 deleteByEngineId();
	 
	}
	public static void deleteByEngineId() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Engine e=em.find(Engine.class,100);
		//update engine_id
		Query updateQuery=em.createNativeQuery("UPDATE Car set engine_id=null where engine_id=?1");
	      updateQuery.setParameter(1,100);
	     

	    // Step 2: Delete Engine
	    Query deleteQuery=em.createNativeQuery("DELETE FROM Engine WHERE id =?1");
	      deleteQuery.setParameter(1,100);
	      et.begin();
	      updateQuery.executeUpdate();
	      deleteQuery.executeUpdate();
		et.commit();
	}
	
	public static void FindCarById() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Car c=em.find(Car.class,1);
		
		System.out.println(c);
		
		System.out.println(c.getEngine()+" "+c.getModel());
		
		
		
	}
		public static void insertCarandEngine() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Engine e=new Engine();
		e.setId(100);
		e.setType("V9");
		e.setFuelType("Diesel");
		e.setMileage("13");
		e.setCc("3000");
		
		
		Car c=new Car();
		c.setId(1);
		c.setModelYear("dt10");
		c.setBrand("volkswagen");
		c.setModelYear("2019");
		c.setPrice(10000000);
		c.setEngine(e);
		
		et.begin();
		em.persist(e);
		em.persist(c);
		et.commit();
		
		
		
	
	}

}
