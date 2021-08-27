package com.mycom.collections.set.removeduplicates;
import java.util.HashSet;
import java.util.Set;

public class MainHashSetUniqueId {

	public static void main(String[] args) {
		Set<Employee> employeeset= new HashSet<Employee>();
		
		employeeset.add(new Employee(101,"NEsha"));
		employeeset.add(new Employee(102,"ayEsha"));
		
		
		employeeset.add(new Employee(101,"ajay"));
		employeeset.add(new Employee(102,"ajju"));
		
  for(Employee emp:employeeset) {
	  System.out.println("Employee id: "+emp.getId());
	  System.out.println("Employee Name: "+emp.getName());
	  System.out.println("Hashcode: "+emp.hashCode());
  }
	}

}
