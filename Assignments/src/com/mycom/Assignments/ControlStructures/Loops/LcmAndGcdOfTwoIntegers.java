package com.mycom.Assignments.ControlStructures.Loops;

import java.util.Scanner;

public class LcmAndGcdOfTwoIntegers {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of Number1");
		float num1=sc.nextInt();
				sc.nextLine();
	    System.out.println("Enter value of Number2");
	    float num2=sc.nextInt();
			   sc.nextLine();
			   float GCD=0;
		 for(float i=1;i<=num1;i++) {
			 
			 if(num1%i==0&&num2%i==0) {
			  GCD=i;
			 }
		 }
		 
		 float LCM=(num1*num2)/GCD;
		 
		 System.out.println("The Value of GCD is: "+GCD);
		 System.out.println("The Value of LCM is: "+LCM);
		 sc.close();
		 
	}

}
