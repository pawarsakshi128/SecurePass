package com.example.demo;

import java.util.Scanner;
public class PasswordStrength{
	public static void main(String args[]) {
		//String pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls Enter your Password:- ");
		String pass = sc.nextLine();
		String uppercase= "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
		String lowercase= "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
		String digit= "0,1,2,3,4,5,6,7,8,9";
		String splchar="!,@,#,$,%,^,&,*,(,),[,],{,},?";
		if((pass.length()>=12) || (pass == lowercase) && (pass == uppercase) && (pass == digit) && (pass == splchar)){
			System.out.println("Your password is strong ");
		} else if( (pass.length()>=8 && pass.length()<12) || (pass == lowercase)||(pass== uppercase)||(pass == digit)||(pass == splchar)) {
			System.out.println("Your passowrd is moderate ");
		} else {
			System.out.println("Your password is week");
		}
		sc.close();
	}
}