package com.mycom.Assignments.CollectionsFramework;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mycom.Assignments.CollectionsFramework.Employee;
import com.mycom.Assignments.CollectionsFramework.EmployeeDao;
import com.mycom.Assignments.CollectionsFramework.EmployeeObject;

public class MainApp {
	  Employee emp=new Employee();
	 static ArrayList<Employee>emplist=new ArrayList<Employee>();
	 

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
         
		
			float totalSalary = 0;
			for(Employee employee: emplist) {
				System.out.println("Employee name: " + employee.getEmpName() + "\n employee id: " + employee.getEmpId()
				+ "\n designation: " + employee.getDesignation() + "\n department: " + employee.getDept() + "\n "
						+ "salary: " + employee.getSalary());
				
				totalSalary += employee.getSalary();
			}
			
			System.out.println("Total salary of all employees is: " + totalSalary);
		
	}

	}


