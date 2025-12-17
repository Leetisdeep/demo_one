package com.example.demo; // или ваш корневой пакет

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Добавьте аннотацию @ComponentScan с путями к вашим пакетам
@SpringBootApplication
@ComponentScan(basePackages = {"com.example", "controller", "service", "model"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}