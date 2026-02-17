package com.service;

import java.util.List;

import com.dao.UserDao;
import com.dao.OrderDAO;
import com.dao.PaymentDAO;
import com.mapping.*;

public class EcommerceService {

    private UserDao userDao = new UserDao();
    private OrderDAO orderDao = new OrderDAO();
    private PaymentDAO paymentDao = new PaymentDAO();

    // . Register User with Profile
    public void registerUser(User user, Profile profile) {

        user.setProfile(profile);
        userDao.saveUser(user);
    }

    //Add Orders to User (FIXED VERSION)
    public void addOrdersToUser(int userId, List<PurchaseOrder> orders) {

        User user = userDao.findUser(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        
        for (PurchaseOrder order : orders) {
            orderDao.saveOrder(order);
        }

        // Now attach orders to user
        user.setList(orders);

        userDao.updateUser(user);

        System.out.println("Orders added successfully");
    }

    // Add Payment to Order
    public void addPaymentToOrder(int orderId, Payment payment) {

        PurchaseOrder order = orderDao.findOrder(orderId);

        if (order == null) {
            System.out.println("Order not found");
            return;
        }

        payment.setPurchaseorder(order);

        paymentDao.savePayment(payment);

        System.out.println("Payment added successfully");
    }

    // Fetch User
    public User fetchUserWithOrders(int userId) {

        return userDao.findUser(userId);
    }

    // Delete User
    public void deleteUser(int userId) {

        userDao.deleteUser(userId);
        System.out.println("User deleted successfully");
    }

    //  Update Order Amount (FIXED)
    public void updateOrderAmount(int orderId, int newAmount) {

        PurchaseOrder order = orderDao.findOrder(orderId);

        if (order == null) {
            System.out.println("Order not found");
            return;
        }

        order.setTotalamount(newAmount);

       
        orderDao.saveOrder(order); 
    }
}
