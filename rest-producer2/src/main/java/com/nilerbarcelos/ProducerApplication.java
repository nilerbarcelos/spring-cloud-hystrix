package com.nilerbarcelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.nilerbarcelos.controller.HelloControllerImpl;

@SpringBootApplication
@ComponentScan(basePackageClasses = HelloControllerImpl.class)
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
