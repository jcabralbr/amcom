package com.amcom.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = "com.amcom.order")
public class OrderProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderProducerApplication.class, args);
    }
}