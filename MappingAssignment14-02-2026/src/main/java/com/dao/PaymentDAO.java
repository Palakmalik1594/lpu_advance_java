package com.dao;

import javax.persistence.*;

import com.mapping.Payment;

public class PaymentDAO {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgres");

    public void savePayment(Payment p) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(p);
        et.commit();

        em.close();
    }

    public Payment findPayment(int id) {

        EntityManager em = emf.createEntityManager();
        Payment p = em.find(Payment.class, id);
        em.close();
        return p;
    }
}
