package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginController {

    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();

        String user1 = "user1";
        String pass1 = "123456";
        String user2 = "user2";
        String pass2 = "qwerty";
        String user3 = "user3";
        String pass3 = "password123";
        String user4 = "user4";
        String pass4 = "P@ssw0rd!";
        String user5 = "user5";
        String pass5 = "NinjaTurtle42";
        String user6 = "user6";
        String pass6 = "December25th! ";
        String user7 = "user7";
        String pass7 = "[email protected]";
        String user8 = "user8";
        String pass8 = "[email protected]$$w0rd!";
        String user9 = "user9";
        String pass9 = "[email protected]!aNc3C0mp13x";
        String user10 = "user10";
        String pass10 = "P3rs1st3nt&Res1|!3nt";

        if (username.equals(user1) && password.equals(pass1)) {
            return "Login Successful!!!\nWelcome to Rackathon";
        } else if (username.equals(user2) && password.equals(pass2)) {
            return "Login Successful!!!\nWelcome to Rackathon";
        } else if (username.equals(user3) && password.equals(pass3)) {
            return "Login Successful!!!\nWelcome to Rackathon";
        } else if (username.equals(user4) && password.equals(pass4)) {
            return "Login Successful!!!\nWelcome to Rackathon";
        } else if (username.equals(user5) && password.equals(pass5)) {
            return "Login Successful!!!\nWelcome to Rackathon";
        } else if (username.equals(user6) && password.equals(pass6)) {
            return "Login Successful!!!\nWelcome to Rackathon";
        } else if (username.equals(user7) && password.equals(pass7)) {
            return "Login Successful!!!\nWelcome to Rackathon";
        } else if (username.equals(user8) && password.equals(pass8)) {
            return "Login Successful!!!\nWelcome to Rackathon";
        } else if (username.equals(user9) && password.equals(pass9)) {
            return "Login Successful!!!\nWelcome to Rackathon";
        } else if (username.equals(user10) && password.equals(pass10)) {
            return "Login Successful!!!\nWelcome to Rackathon";
        } else {
            return "Wrong username or password\nPlease try again!!!";
        }
    }
}

class UserLoginRequest {
    private String username;
    private String password;

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
