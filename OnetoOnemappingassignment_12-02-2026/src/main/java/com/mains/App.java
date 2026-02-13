package com.mains;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.AadharCard;
import com.entity.HostelRoom;
import com.entity.Student;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // Save AadharCard
        AadharCard aadhar = new AadharCard();
        aadhar.setAadharId(102);
        aadhar.setAadharNumber("1234-5678-9999");
        aadhar.setAddress("Delhi");
        aadhar.setIssueDate("2021");
        em.persist(aadhar);

        // Save HostelRoom
        HostelRoom room = new HostelRoom();
        room.setRoomId(201);
        room.setRoomNumber("H-12");
        room.setBlockName("A");
        room.setFloorNumber(2);
        em.persist(room);

        // Create Student and associate
        Student student = new Student();
        student.setId(2);
        student.setName("Palak");
        student.setEmail("palak@gmail.com");
        student.setBranch("csc");
        student.setAadharCard(aadhar);
        student.setHostelRoom(room);

        em.persist(student);
        tx.commit();

        // Fetch Student
        Student s = em.find(Student.class, 2);

        s.getId();
        s.getName();
        s.getEmail();
        s.getBranch();

        AadharCard a = s.getAadharCard();
        a.getAadharId();
        a.getAadharNumber();
        a.getAddress();
        a.getIssueDate();

        HostelRoom h = s.getHostelRoom();
        h.getRoomId();
        h.getRoomNumber();
        h.getBlockName();
        h.getFloorNumber();

        System.out.println(s.getName());
        System.out.println(a.getAadharNumber());
        System.out.println(h.getRoomNumber());
        tx.begin();
        em.remove(s);
        tx.commit();

        em.close();
        emf.close();
    }
}