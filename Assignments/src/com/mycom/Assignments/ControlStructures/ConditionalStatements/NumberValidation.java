package com.mycom.Assignments.ControlStructures.ConditionalStatements;

import java.util.Scanner;

public class NumberValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
        float Number=sc.nextFloat();
        sc.nextLine();
        
        if(Number<0) {
        	System.out.println("Negative");
        }else if((Number>0)){
        	System.out.println("Positive");
        }else {
        	System.out.println("Zero");
        }
        sc.close();

	}

}
