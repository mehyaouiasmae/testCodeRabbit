package com.example.testcoderabbit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public String testEndpoint() {
        return "test review code Rebbit";
    }

    @GetMapping("/error")
    public ResponseEntity<String> errorEndpoint() {
        // Simuler une erreur
        throw new RuntimeException("Erreur de test pour Code Rabbit");
    }
} 