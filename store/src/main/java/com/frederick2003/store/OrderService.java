package com.frederick2003.store;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private final PaymentService paymentService;

    public OrderService( PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("Order Service Created");
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean accessed after initialisation");
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }
}