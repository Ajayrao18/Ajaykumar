package com.mycom.Assignments.ControlStructures;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
       System.out.println("Eenter the value of radius");
       float radius=sc.nextFloat();
       sc.nextLine();
      float   Area_of_Circle= (float) (Math.PI*radius*radius);
       
       System.out.println("Area of circle = "+Area_of_Circle);
       sc.close();
       
	}

}
