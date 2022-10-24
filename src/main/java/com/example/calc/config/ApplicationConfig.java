package com.example.calc.config;

import com.example.calc.service.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public Calculator configCalculator(){
        System.out.println("Creamos bean Calculator.");
        return new Calculator();
    }
}
