package com.mockitoprac;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UserDao {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("postgres");
		EntityManager em=emf.createEntityManager();
		
		public void insertUsers() {
		EntityTransaction et=em.getTransaction();
		User u=new User();
		u.setId(1);
		u.setName("palak");
		u.setBalance(2000);
		et.begin();
		em.persist(u);
		et.commit();
		
	}
		public User findById(int id) {
			return em.find(User.class,1);
		}
		

}
