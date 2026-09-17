package com.example.demo;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) { // Dependency Injection - Constructor intialization
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        // Violated SRP - OrderService is responsible for both placing the order and processing the payment
        // OrdersService should not create an instance of PaymentService directly, as it creates a tight coupling between the two classes.
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment();
        System.out.println("Order placed successfully!");

        // With Dependency Injection
        // Inverted control - OrderService now depends on the PaymentService instance handed to it via the constructor, not one it creates itself.
        this.paymentService.processPayment();
        System.out.println("Order placed successfully!");
    }
}
