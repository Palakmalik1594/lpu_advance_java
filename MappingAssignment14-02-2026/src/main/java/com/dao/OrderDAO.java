package com.dao;

import java.util.List;

import javax.persistence.*;

import com.mapping.PurchaseOrder;
import com.mapping.User;

public class OrderDAO {

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgres");

    public void saveOrder(PurchaseOrder o) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        em.persist(o);
        et.commit();

        em.close();
    }

    public PurchaseOrder findOrder(int id) {

        EntityManager em = emf.createEntityManager();
        PurchaseOrder o = em.find(PurchaseOrder.class, id);
        em.close();
        return o;
    }

    public List<PurchaseOrder> findOrdersByUser(int userId) {

        EntityManager em = emf.createEntityManager();

        User u = em.find(User.class, userId);
        List<PurchaseOrder> orders = u.getList();

        em.close();
        return orders;
    }
}
