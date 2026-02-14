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
    
    public void registerUser(User user, Profile profile) {

        user.setProfile(profile);

        userDao.saveUser(user);
    }
    
    public void addOrdersToUser(int userId, List<PurchaseOrder> orders) {

        User user = userDao.findUser(userId);

        user.setList(orders);

        userDao.updateUser(user);
    }
    
    public void addPaymentToOrder(int orderId, Payment payment) {

        PurchaseOrder order = orderDao.findOrder(orderId);

        payment.setPurchaseorder(order);

        paymentDao.savePayment(payment);
    }
    public User fetchUserWithOrders(int userId) {

        return userDao.findUser(userId);
    }
    public void deleteUser(int userId) {

        userDao.deleteUser(userId);
    }
    public void updateOrderAmount(int orderId, int newAmount) {

        PurchaseOrder order = orderDao.findOrder(orderId);

        order.setTotalamount(newAmount);

        orderDao.saveOrder(order);
    }
}
