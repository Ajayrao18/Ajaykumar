package com.mycom.Assignments.ControlStructures.Loops;

import java.util.Scanner;

public class IntegerToRoman {

	public static int values[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	public static String symbol[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	
	public static String ConvertToRoman(int n) {
		StringBuilder s = new StringBuilder();
		for(int i=0;n>0;i++) {
			while (n >= values[i]) {
				n -= values[i];
				s.append(symbol[i]);
			}
			
		}
		
		return s.toString();
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer Number");
		int n=sc.nextInt();
		System.out.println(n+" convert to roman number: "+ConvertToRoman(n));
		sc.close();
   
	}

}
