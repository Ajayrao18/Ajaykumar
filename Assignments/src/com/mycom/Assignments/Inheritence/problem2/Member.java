package com.mycom.Assignments.Inheritence.problem2;

public class Member {
	String Name;
	int Age, Phonenumber;
	String Address;
	float Salary;
	public Member(String name, int age, int phonenumber, String address, float salary) {
		super();
		Name = name;
		Age = age;
		Phonenumber = phonenumber;
		Address = address;
		Salary = salary;
	}
	
	public void printsalary() {
		System.out.println("prints Salary of Member");
		System.out.println("Salary: "+Salary);
		System.out.println("");
	}

}
