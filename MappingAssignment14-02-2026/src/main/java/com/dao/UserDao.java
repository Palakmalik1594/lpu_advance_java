package com.dao;

import javax.persistence.*;

import com.mapping.User;

public class UserDao {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgres");

    public void saveUser(User u) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(u);
        et.commit();

        em.close();
    }

    public User findUser(int id) {

        EntityManager em = emf.createEntityManager();
        User u = em.find(User.class, id);
        em.close();
        return u;
    }

    public void deleteUser(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        User u = em.find(User.class, id);

        et.begin();
        em.remove(u);
        et.commit();

        em.close();
    }

    public void updateUser(User u) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.merge(u);
        et.commit();

        em.close();
    }
}
