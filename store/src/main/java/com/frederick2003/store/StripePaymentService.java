package com.frederick2003.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String url;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Amount:" + amount);
        System.out.println("API Url: " + url);
        System.out.println("Stripe Enabled: " + enabled );
        System.out.println("Stripe timeout: " + timeout);
        System.out.println("Stripe: " + supportedCurrencies);
    }
}