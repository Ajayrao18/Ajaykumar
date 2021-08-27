package com.mycom.Assignments.ControlStructures;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of length");
		float lenght=sc.nextFloat();
		sc.nextLine();
		System.out.println("enter the value of width");
		float width=sc.nextFloat();
		sc.nextLine();
		
		float Area_of_Rectangle=(lenght * width);
		float Perimeter_of_Rectangle=2*(lenght + width);
		
		System.out.println("lenght: "+lenght);
		System.out.println("width: "+width);
		System.out.println("Area_of_rectangle: "+Area_of_Rectangle);
		System.out.println("perimeter_of_rectangle: "+Perimeter_of_Rectangle);
		sc.close();
		

	}

}
