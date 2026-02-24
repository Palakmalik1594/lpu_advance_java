package com.assignment;


import javax.persistence.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();

        CustomerService customerService = new CustomerService(em);
        ProductService productService = new ProductService(em);
        LeadService leadService = new LeadService(em);
        OrderService orderService = new OrderService(em);
        TicketService ticketService = new TicketService(em);

        
        customerService.registerCustomer("Palak", "palak123@gmail.com", "949898398");

        
        Address addr = new Address();
        addr.setStreet("GT Road");
        addr.setCity("ROhtak");
        addr.setState("Rohtak");
        addr.setZipCode("1232321");
        customerService.addAddressToCustomer(1L, addr);

        
        productService.addProduct("Screen", 423000);
        productService.addProduct("Printer", 440);

        
        leadService.createLead("Prisha", "Server", "prishade@gmail.com");

        EntityTransaction et = em.getTransaction();
        et.begin();
        SalesEmployee emp = new SalesEmployee();
        emp.setName("Riya");
        emp.setDepartment("Sales");
        em.persist(emp);
        et.commit();

        leadService.assignLeadToEmployee(1L, 1L);

        leadService.convertLeadToCustomer(1L);

        
        List<Long> productIds = new ArrayList<>();
        productIds.add(1L);
        productIds.add(2L);
        orderService.placeOrder(1L, productIds);

        
        ticketService.raiseTicket(1L, "Product is not working");

        em.close();
        emf.close();

        System.out.println("CRM operations completed.");
    }
}