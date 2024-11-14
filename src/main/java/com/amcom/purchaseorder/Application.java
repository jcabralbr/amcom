package com.amcom.purchaseorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = "com.amcom.purchaseorder")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}