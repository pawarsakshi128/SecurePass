package com.example.demo.controllers;

import java.security.SecureRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordGeneratorController {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*(){}[]?";

    @GetMapping("/generate-password")
    public String generatePassword(@RequestParam int length) {
        if (length < 8) {
            return "Password length must be greater than 8.";
        }

        StringBuilder sb = new StringBuilder();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }

        String generatedPassword = sb.toString();
        System.out.println("Generated Password: " + generatedPassword);

        return generatedPassword;
    }
}
