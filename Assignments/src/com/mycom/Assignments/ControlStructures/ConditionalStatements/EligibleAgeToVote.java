package com.mycom.Assignments.ControlStructures.ConditionalStatements;

import java.util.Scanner;

public class EligibleAgeToVote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Age");
		int Age=sc.nextInt();
		sc.nextLine();
		
		if(Age>=18) {
			System.out.println("You are Eligible to Vote");
		}else {
			System.out.println("You are Not Eligible to Vote");
		}

	}

}
