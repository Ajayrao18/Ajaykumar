package com.mycom.Assignments.Inheritence.problem2;

public class Manager extends Employee{

	public Manager(String name, int age, int phonenumber, String address, float salary, String specialization,
			String department) {
		super(name, age, phonenumber, address, salary, specialization, department);
		this.Name = name;
		this.Age = age;
		this.Phonenumber = phonenumber;
		this.Address = address;
		this.Salary = salary;
		this.specialization=specialization;
		this.department=department;
	}

	public void showManagerDetails() {
		System.out.println("Manager Details: ");
		System.out.println("Name: "+Name+"\n"+"Age: "+Age+"\n"+"Phonenumber: "+Phonenumber+"\n"
				+"Address: "+Address+"\n"+"Salary: "+Salary+"\n"+"specialization: "+specialization+"\n"
				+"department: "+department);
		System.out.println("");
	}
}
