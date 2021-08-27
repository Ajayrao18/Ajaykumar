package com.mycom.Assignments.Inheritence;

public class Employee {
	String empName, address, emailid;
	int id;
	int mobileNo;
	public Employee(String empName, String address, String emailid, int id, int mobileNo) {
		super();
		this.empName = empName;
		this.address = address;
		this.emailid = emailid;
		this.id = id;
		this.mobileNo = mobileNo;
		
}
	
	
	public void showEmployee() {
	      System.out.println("empName"+empName+"address"+address+"emailid"+emailid+"id"+id+"mabile no"+mobileNo);
	}
	
}