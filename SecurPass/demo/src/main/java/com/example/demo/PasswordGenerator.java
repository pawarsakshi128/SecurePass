package com.example.demo;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

        @SuppressWarnings("resource")
        public static void  main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int length;
            String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "abcdefghijklmnopqrstuvwxyz"+"0123456789"+"!@#$%^&*(){}[]?<>/|:;+-";
            StringBuilder sb = new StringBuilder();
            System.out.println("Enter the length of password you want to generate (above 8): ");
            length = sc.nextInt();
            if(length >8) {
                for(int i=1;i<=length;i++) {
                int any = new Random().nextInt(alphanumeric.length());
                char randomchar = alphanumeric.charAt(any);
                sb.append(randomchar);
                }
                sb.toString();
                System.out.println("Your strong Password is: "+ sb.toString());
            } else {
                System.out.println("Enter the valid length of password!!!");
            }
        }
    }

