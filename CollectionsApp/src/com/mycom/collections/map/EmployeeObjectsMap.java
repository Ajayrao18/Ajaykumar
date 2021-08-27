package com.mycom.collections.map;

import java.util.HashMap;

import java.util.Scanner;

public class EmployeeObjectsMap {

	public static void main(String[] args) {
		Integer id; //key
		String name,job;
		float salary;
		Scanner sc=new Scanner(System.in);
		
		HashMap<Integer,Employee> empMap=new HashMap<Integer,Employee>();
		
		for(int count =1; count<=2; count++) {
			System.out.println("enter Employee id(key)");
			id=sc.nextInt();
		     sc.nextLine();
		     
		     System.out.println("enter employee details -name,job,salary ");
		     
		     name=sc.nextLine();
		     job=sc.nextLine();
		     salary=sc.nextFloat();		
		     sc.nextLine();
		     Employee emp=new Employee(name,job,salary);
		     
		     empMap.put(id,emp); //key which is integer object, emp is value of employee class object
		     id=  null;
		     emp= null;
		}
		     
		     // integer on keys
		     for(Integer key:empMap.keySet()) {
		    	 
		    Employee emp1 = empMap.get(key); //retrieves employee object
		    	
		    	 System.out.println("emp id : "+key+" name:"+emp1.getName()+"\t"+"job: "+emp1.getJob()+"\t"+"salary: "+emp1.getSalary());
		    	 emp1=null;
		     }
		
         sc.close();
	}

}
