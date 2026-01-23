package com.frederick2003.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${stripe.enabled}")
    private boolean stripeEnabled;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        if (stripeEnabled){
            return new OrderService(stripe());
        }
        
        return new OrderService(paypal());

    }

}
