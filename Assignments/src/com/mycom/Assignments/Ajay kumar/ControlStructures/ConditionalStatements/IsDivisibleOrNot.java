package com.mycom.Assignments.ControlStructures.ConditionalStatements;

import java.util.Scanner;

public class IsDivisibleOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter value of m");
		int m=sc.nextInt();
		sc.nextLine();
		
		System.out.println(n+" is divisible By "+m);
		boolean divisible=n % m == 0;
		if(divisible) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		sc.close();

	}

}
