package com.mycom.Assignments.ControlStructures;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		int num,num1,num2;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter num1 ");
		  num1=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter Num2");
		  num2=sc.nextInt();
		 sc.nextLine();
		
		 System.out.println("Before swapping ");  //before swapping
		 System.out.println("num1: "+num1);
		 System.out.println("num2: "+num2);
		 
		 
		 num=num1;
		 num1=num2;
		 num2=num;
		                                      
		 System.out.println("After swapping"); //after swapping
		 System.out.println("num1: "+num1);
		 System.out.println("num2: "+num2);
		 
		 sc.close();

	}

}
