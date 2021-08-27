package com.mycom.Assignments.ControlStructures;

import java.util.Scanner;

public class SolveEquation {

	public static void main(String[] args) {
		   
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the value of a: ");  
		double a = sc.nextDouble();  
		System.out.print("Enter the value of b: ");  
		double b = sc.nextDouble();  
		System.out.print("Enter the value of c: ");  
		double c = sc.nextDouble();  
		double d= b * b - 4.0 * a * c;  
		if (d< 0.0)   
		{  
		double root1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
		double root2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
		System.out.println("The roots are " + root1 + " and " + root2);  
		}   
		else if (d == 0.0)   
		{  
		double r1 = -b / (2.0 * a);  
		System.out.println("The root is " + r1);  
		}   
		else   
		{  
		System.out.println("Roots are not real.");  
		}  
	}

}
