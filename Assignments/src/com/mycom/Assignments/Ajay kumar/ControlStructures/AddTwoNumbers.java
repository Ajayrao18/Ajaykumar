package com.mycom.Assignments.ControlStructures;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter num1");
		 float num1=sc.nextFloat();
		 sc.nextLine();
		 System.out.println("enter num2");
		 float num2=sc.nextFloat();
		 sc.nextLine();
		 
		 float sum=Float.sum(num1, num2);
		 System.out.println("num1 = "+num1);
		 System.out.println("num2 = "+num2);
		 System.out.println("Adding Two Numbers = "+sum);
      sc.close();
	}

}
