package com.example.demo;

import java.util.Scanner;
public class UserLogin {

	public static void main(String[] args) {
     @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
     String user1 ="user1";
     String pass1 ="123456";
     String user2 ="user2";
     String pass2 ="qwerty";
     String user3 ="user3";
     String pass3 ="password123";
     String user4 ="user4";
     String pass4 ="P@ssw0rd!";
     String user5 ="user5";
     String pass5 ="NinjaTurtle42";
     String user6 ="user6";
     String pass6 ="December25th! ";
     String user7 ="user7";
     String pass7 ="[email protected]";
     String user8 ="user8";
     String pass8 ="[email protected]$$w0rd!";
     String user9 ="user9";
     String pass9 ="[email protected]!aNc3C0mp13x";
     String user10 ="user10";
     String pass10 ="P3rs1st3nt&Res1|!3nt";
     System.out.println("pls enter your username: ");
     String user=sc.next();
     System.out.println("pls enter your password: ");
     String pass=sc.next();
     if(user.equals(user1) && pass.equals(pass1)) {
    	 System.out.println("Login Successful!!!");
    	 System.out.println("Welcome to rackathon");
     }else if(user.equals(user2) && pass.equals(pass2)) {
    	 System.out.println("Login Successful!!!");
    	 System.out.println("Welcome to rackathon");
     }else if(user.equals(user3) && pass.equals(pass3)) {
    	 System.out.println("Login Successful!!!");
    	 System.out.println("Welcome to rackathon");
     }else if(user.equals(user4) && pass.equals(pass4)) {
    	 System.out.println("Login Successful!!!");
    	 System.out.println("Welcome to rackathon");
     } else if(user.equals(user5) && pass.equals(pass5)) {
    	 System.out.println("Login Successful!!!");
    	 System.out.println("Welcome to rackathon");
     }else if(user.equals(user6) && pass.equals(pass6)) {
    	 System.out.println("Login Successful!!!");
    	 System.out.println("Welcome to rackathon");
     }else if(user.equals(user7) && pass.equals(pass7)) {
    	 System.out.println("Login Successful!!!");
    	 System.out.println("Welcome to rackathon");
     }else if(user.equals(user8) && pass.equals(pass8)) {
    	 System.out.println("Login Successful!!!");
    	 System.out.println("Welcome to rackathon");
     }else if(user.equals(user9) && pass.equals(pass9)) {
    	 System.out.println("Login Successful!!!");
    	 System.out.println("Welcome to rackathon");
     }else if(user.equals(user10) && pass.equals(pass10)) {
    	 System.out.println("Login Successful!!!");
    	 System.out.println("Welcome to rackathon");
     }else {
    	 System.out.println("Wrong username or password");
    	 System.out.println("Please try again!!!");
     }
}
}


