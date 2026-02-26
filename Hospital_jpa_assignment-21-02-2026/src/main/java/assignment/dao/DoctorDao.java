package assignment.dao;

import javax.persistence.*;

import assignment.entity.Doctor;

import java.util.List;

public class DoctorDao{

    private EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("postgres");

    public void projectNames() {
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT d.name FROM Doctor d");
        List<Doctor> list = q.getResultList();

        for (Doctor o : list) {
            System.out.println(o);
        }
        em.close();
    }
}
