package com.mycom.Assignments.ControlStructures.Loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result,sum=0;   
		System.out.println("enter number value");
		  int num=sc.nextInt(); 
		  sc.nextLine();
		  
		 int temp=num;    
		  while(num>0){    
		   result=num%10;  //getting remainder  
		   sum=(sum*10)+result;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("it's not palindrome");    
		  sc.close();
		} 
	

}
