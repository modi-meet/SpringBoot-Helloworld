package com.example.demo;

public class Main {

    public static void main(String[] args) {
        // Without Dependency Injection - NO Inversion of Control
        OrderService order = new OrderService();
        order.placeOrder();

        // Dependency Injection - Inversion of Control
        PaymentService payment = new PaymentService();
        OrderService orderService = new OrderService(payment);
        orderService.placeOrder();
    }
}