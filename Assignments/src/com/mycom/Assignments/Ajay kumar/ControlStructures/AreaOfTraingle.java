package com.mycom.Assignments.ControlStructures;

import java.util.Scanner;

public class AreaOfTraingle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the sideA ");
		float SideA=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the sideB ");
		float SideB=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the sideC ");
		float SideC=sc.nextFloat();
		sc.nextLine();
		
		float semi_perimeter=(SideA+SideB+SideC)/2; 
		
		float Area_of_Traingle=(float) Math.sqrt(semi_perimeter*(semi_perimeter-SideA)*(semi_perimeter-SideB)*(semi_perimeter-SideC));
		
		System.out.println("Enter SideA value = "+SideA);
		System.out.println("Enter SideB value = "+SideB);
		System.out.println("Enter SideC value = "+SideC);
		System.out.println("value of semi_perimeter is = "+semi_perimeter);
		System.out.println("Area of Traingle with 3sides is = "+Area_of_Traingle);
		sc.close();
	}

}

