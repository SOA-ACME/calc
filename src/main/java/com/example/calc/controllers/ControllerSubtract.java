package com.example.calc.controllers;

import com.example.calc.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSubtract {
    @Autowired
    private Calculator calculator;

    public ControllerSubtract(){
        System.out.println("Creando Controlador Subtract.");
    }

    @GetMapping("/restar")
    public String restar(){
        int a = 5;
        int b = 10;
        return "La resta de los números: "+a+" y "+b+" en: "+calculator.subtract(a, b);
    }
}
