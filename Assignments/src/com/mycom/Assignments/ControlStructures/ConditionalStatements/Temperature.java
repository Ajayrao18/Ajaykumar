package com.mycom.Assignments.ControlStructures.ConditionalStatements;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature value");
        int Temperature=sc.nextInt();
        sc.nextLine(); 
        
        if(Temperature<0) {
        	System.out.println("ICE");
        }else if((Temperature <=100)&(Temperature>=0)){	
        	System.out.println("WATER");
        }else {	
        	 System.out.println("STEAM"); 
        }
//        switch(Temperature) {
//        case Temperature<0:
//           	System.out.println("ICE");
//        case 1:
//           	System.out.println("WATER");        	
//        case 2:
//               	System.out.println("STEAM");         
//        } 
        sc.close();
	}

}
