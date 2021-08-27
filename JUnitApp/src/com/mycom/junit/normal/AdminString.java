package com.mycom.junit.normal;

import java.util.Scanner;

public class AdminString {
	
	String username;
	Scanner sc=new Scanner(System.in);
	
	public String readString() {       //adminstringreader
		System.out.println("Enter string as admin");
		username=sc.nextLine();
		return this.username;
		
	}

}
