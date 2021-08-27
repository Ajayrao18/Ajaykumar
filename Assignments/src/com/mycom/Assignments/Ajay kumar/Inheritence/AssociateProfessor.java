package com.mycom.Assignments.Inheritence;

public class AssociateProfessor extends AssistantProfessor {

	public AssociateProfessor(String empName, String address, String emailid, int id, int mobileNo) {
		super(empName, address, emailid, id, mobileNo);
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
		staffclub=basicpay*0.1f;
	}
	
	public void computerGrosspay() {
		Grosspay=basicpay+DA+Hra;
	}
	public void computeNetpay() {
		Netpay=Grosspay-PF-staffclub;
	}
}
