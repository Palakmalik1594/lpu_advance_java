package com.mapping;

import javax.persistence.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Users u1 = new Users();
        u1.setName("Palak");
        u1.setPassword("4354");
        u1.setEmail("palak132@gmail.com");

        Post p1 = new Post();
        p1.setTitle("yes right");
        p1.setContent("good work done right");
        p1.setCreatedAt("12-07-2025");
        p1.setUpdatedAt("20-05-2026");
        p1.setAuthor(u1);

        Comment c1 = new Comment();
        c1.setContent("amazing post!");
        c1.setCreatedAt("12-12-2025");
        c1.setPost(p1);
        c1.setAuthor(u1);

        et.begin();
        em.persist(u1);
        em.persist(p1);
        em.persist(c1);
        et.commit();

        em.close();
        emf.close();
        
    }
}