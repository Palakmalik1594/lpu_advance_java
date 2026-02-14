package com.onetomanymapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main1 {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Colleges c=em.find(Colleges.class,2);
		List<Students> list=c.getS();
		Students s=new Students();
		s.setStudent_id(106);
		s.setName("palakk");
		s.setBranch("it");
		
		et.begin();
		em.persist(s);
		et.commit();
		
		et.begin();

		String sqldel="delete from colleges_students where student_student_id=?1";
		String sql1="Delete from students where student_id=?1";
		// remove relation first
		Query q1 = em.createNativeQuery(sqldel);
		Query q2 = em.createNativeQuery(sql1);
		q1.setParameter(1,104);
		q2.setParameter(1,104);
		q1.executeUpdate();
		// then remove student
		
		
		q2.executeUpdate();

		et.commit();

		
		
		
	}

}
