package com.mycom.collections.map;

public class Employee {
	private String name;
	private String job;
	private float salary;
	
	public Employee(String name, String job, float salary) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}
