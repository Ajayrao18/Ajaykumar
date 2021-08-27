package com.mycom.Assignments.ControlStructures;

import java.util.Scanner;

public class SimpleInterestAndCompoundInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the Principal value");
		double Principal = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the number_of_years");
		double number_of_years = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the rate_of_interest");
		double rate_of_interest=sc.nextInt();
		sc.nextLine();
		
		double SimpleInterest=(Principal*number_of_years*rate_of_interest)/100;
		double CompoundInterest=Principal*Math.pow((1+rate_of_interest/100),number_of_years);
		
		System.out.println("Pricipal = "+Principal);
		System.out.println("number_of_years = "+number_of_years);
		System.out.println("rate_of_interest = "+rate_of_interest);
		System.out.println("SimpleInterest = "+SimpleInterest);
		System.out.println("CompoundInterest = "+CompoundInterest);
		sc.close();
	}

}
