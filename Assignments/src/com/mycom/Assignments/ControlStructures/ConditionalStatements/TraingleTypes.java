package com.mycom.Assignments.ControlStructures.ConditionalStatements;

import java.util.Scanner;

public class TraingleTypes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of SideA");
		int A=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter value of SideB");
		int B=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter value of SideC");
		int C=sc.nextInt();
		sc.nextLine();
           
		
		
		if((A==B)&(B==C)) {
			System.out.println("Equilateral Traingle");
		}else if((A==B)||(B==C)||(C==A)) {
			System.out.println("Isosceles Triangle");
		}else {
			System.out.println("Scalene Traingle");
		}
	sc.close();
	}

}
