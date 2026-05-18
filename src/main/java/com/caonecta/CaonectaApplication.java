package com.caonecta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.caonecta")
public class CaonectaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaonectaApplication.class, args);
    }
}