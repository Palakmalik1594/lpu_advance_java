package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		 // creating department
		Department d=new Department();
		//d.setId(4);
		d.setName("palak");
		d.setManagername("prisha");
		d.setCount_emp(5);
		
		
		//create employee
		Employee e1=new Employee();
		//e1.setId(103);
		e1.setName("supriya");
		e1.setSalary(26000);
		e1.setDesignation("iosdeveloper");
		e1.setDepartment(d);
		Employee e2 = new Employee();
		//e2.setId(104);
		e2.setName("Amisha");
		e2.setSalary(30000);
		e2.setDesignation("Tester");
		e2.setDepartment(d);   

		
		
		
		et.begin();
		em.persist(d);
		em.persist(e1);
		em.persist(e2);
		et.commit();
		
		
	}

}
