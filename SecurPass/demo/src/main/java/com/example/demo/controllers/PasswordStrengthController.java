package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordStrengthController {

    @GetMapping("/checkPasswordStrength")
    public String checkPasswordStrength(@RequestParam String password) {
        // Define character sets for uppercase letters, lowercase letters, digits, and special characters
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digit = "0123456789";
        String splchar = "!@#$%^&*()[]{}?";

        // Initialize flags to track presence of different character types
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Check each character of the password
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (uppercase.indexOf(ch) != -1) {
                hasUppercase = true;
            } else if (lowercase.indexOf(ch) != -1) {
                hasLowercase = true;
            } else if (digit.indexOf(ch) != -1) {
                hasDigit = true;
            } else if (splchar.indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }

        // Determine password strength based on criteria
        if (password.length() >= 12 && hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
            return "Your password is strong";
        } else if ((password.length() >= 8 && password.length() < 12) &&
		(hasUppercase || hasLowercase || hasDigit || hasSpecialChar)) {
            return "Your password is moderate";
        } else {
            return "Your password is weak";
        }
    }
}
