package com.example.calc.controllers;

import com.example.calc.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAdd {
    @Autowired
    private Calculator calculator;

    public ControllerAdd(){
        System.out.println("Creando Controlador Add.");
    }

    @GetMapping("/sumar")
    public String sumar(){
        int a = 5;
        int b = 10;
        return "La suma de los números: "+a+" y "+b+" en: "+calculator.add(a, b);
    }
}
