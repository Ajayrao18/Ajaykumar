package com.mycom.Assignments.ControlStructures.ConditionalStatements;

import java.util.Scanner;

public class SalesManCommision {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of Amount");
		double Sales_Amount=sc.nextInt();
		
		
		if(Sales_Amount<=10000) {
			double Commission=500;
			System.out.println("The Sales_Amount = "+Sales_Amount);
			System.out.println("Commission = "+Commission);
			
		}else if(Sales_Amount>10000&&Sales_Amount<=12000) {
			double additional_amount=Sales_Amount-10000;
			
			System.out.println("The Sales_Amount = "+Sales_Amount);
			System.out.println("the Additional amount = "+additional_amount);
			double Commission1=500+(additional_amount*0.1);
			System.out.println("Commission = "+Commission1);
		}else if(Sales_Amount>12000&&Sales_Amount<=15000) {
			double additional_amount=2000;
			double additional_amount2=Sales_Amount-12000;
			System.out.println("The Sales_Amount = "+Sales_Amount);
			System.out.println("the Additional amount = "+additional_amount2);
			double Commission2=500+(additional_amount*0.1)+(additional_amount2*0.15);
			System.out.println("Commission = "+Commission2);
		}else {
			double additional_amount=2000;
			double additional_amount2=3000;
			double additional_amount3=Sales_Amount-15000;
			System.out.println("The Sales_Amount = "+Sales_Amount);
			System.out.println("the Additional amount = "+additional_amount3);
			double Commission3=500+(additional_amount*0.1)+(additional_amount2*0.15)+(additional_amount3*0.2);
			System.out.println("Commission = "+Commission3);
			sc.close();
			
		}

	}

}
