package com.mycom.Assignments.ControlStructures.ConditionalStatements;

import java.util.Scanner;

public class Equals_Greater_Smaller_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of Number1");
		float num1=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter value of Number2");
		float num2=sc.nextFloat();
		sc.nextLine();
		
		if(num1==num2) {
			System.out.println("Equal");// if both numbers are Equal
		}else if(num1>num2) {
			System.out.println("Large");// number1 is grater than number2 then print Large
		}else {
			System.out.println("Small"); //number1 is smaller than number2 then print Small
		}

	}

}
