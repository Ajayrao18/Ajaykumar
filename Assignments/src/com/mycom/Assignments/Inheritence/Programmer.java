package com.mycom.Assignments.Inheritence;

import java.util.Scanner;

public class Programmer extends Employee {
	float basicpay, Hra, PF, DA, staffclub,Grosspay,Netpay;

	public Programmer( 
	String empName, String address, String emailid, int id, int mobileNo) {
		super(empName, address,emailid,id, mobileNo);
		this.empName = empName;
		this.address = address;
		this.emailid = emailid;
		this.id = id;
		this.mobileNo = mobileNo;
		
		
		
	}
	public void computeDA() {
		DA=basicpay*0.97f;
	}
	
	public void computeHRA() {
		Hra=basicpay*0.10f;
	}
	
	public void computePF() {
		PF=basicpay*0.12f;
	}
	public void computeStaffClubFund() {
		staffclub=basicpay*0.001f;
	}
	
	public void computerGrosspay() {
		Grosspay=basicpay+DA+Hra;
	}
	public void computeNetpay() {
		Netpay=Grosspay-PF-staffclub;
	}
	public void showProgrammerDetails() {
	
		
		System.out.println("Programmer");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay");
		basicpay=sc.nextInt();
		sc.nextLine();
		computeDA();
		computeHRA();
		computePF();
		computeStaffClubFund();
		computerGrosspay();
		computeNetpay();
		System.out.println("Basic pay: "+basicpay);
		System.out.println("EmpId: " +id);
		System.out.println("EmpName "+empName);
		System.out.println("Address "+address);
		System.out.println("Mail_Id "+emailid);
		System.out.println("Mobile Number "+mobileNo);
        
		System.out.println("Output");
		System.out.println("Grosspay "+Grosspay);
		System.out.println("Netpay "+Netpay);
		sc.close();
	}
	
}
