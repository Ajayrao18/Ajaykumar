package com.mycom.Assignments.ControlStructures.Loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Number Value");
         int num=sc.nextInt();
         sc.nextLine();
         int count=0;
         for(int i=2;i<num;i++) {
        	 if(num%i==0) {
        		 count=count+1;
        	 }
         }
         if(count>0) {
        	 System.out.println("Its Not Prime Number");
         }else {
        	 System.out.println("Prime Number");
         }
         sc.close();
	}

}
