package com.test;

import java.util.*;
import com.mapping.*;
import com.service.EcommerceService;

public class TestMain {

    public static void main(String[] args) {

        EcommerceService service = new EcommerceService();

        // Profile
        Profile profile = new Profile();
        profile.setId(1);
        profile.setPhone("9999999999");
        profile.setAddress("Delhi");

        // User
        User user = new User();
        user.setId(100);
        user.setName("Palak");
        user.setEmail("palak@gmail.com");

        service.registerUser(user, profile);

        // Orders
        PurchaseOrder o1 = new PurchaseOrder();
        o1.setId(201);
        o1.setOrderDate("20-Feb-2026");
        o1.setTotalamount(3000);

        PurchaseOrder o2 = new PurchaseOrder();
        o2.setId(202);
        o2.setOrderDate("21-Feb-2026");
        o2.setTotalamount(4000);

        List<PurchaseOrder> orders = new ArrayList<>();
        orders.add(o1);
        orders.add(o2);

        service.addOrdersToUser(100, orders);

        // Payment
        Payment payment = new Payment();
        payment.setId(301);
        payment.setMode("UPI");
        payment.setAmount(3000);

        service.addPaymentToOrder(201, payment);

        System.out.println("ALL DATA INSERTED SUCCESSFULLY");
    }
}
