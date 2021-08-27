package com.mycom.Assignments.CollectionsFramework;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


import com.mycom.Assignments.CollectionsFramework.Employee;
import  com.mycom.Assignments.CollectionsFramework.DbConnector;
public class EmployeeDao {
	
	
	private static Connection connection=null;
	private static PreparedStatement pstatement=null;
	private static ResultSet resultset=null;
	

	public static void insertEmployeeDetails(Employee emp)throws ClassNotFoundException,SQLException{
		connection =DbConnector.createConnection();
		
		String insQry="insert into Employee values(?,?,?,?)";
		pstatement=connection.prepareStatement(insQry);
		
		pstatement.setInt(1, emp.getEmpId());
		pstatement.setString(2,emp.getEmpName());
		pstatement.setString(3,emp.getDesignation());
		pstatement.setString(4,emp.getDept());
		pstatement.setFloat(5,emp.getSalary());
		
		
		int rows=pstatement.executeUpdate();
		System.out.println(rows+"Rows inserted");
		DbConnector.closeConnection();
	}
	

	static ArrayList<Employee>emplist=null;
	
	private static String empQry="select * from Employee";

      public static ArrayList<Employee>getEmployeeDetails() throws ClassNotFoundException,SQLException{
		
		try {
			//open the connection
			connection= DbConnector.createConnection();
			
			//create pstatement 
			pstatement=connection.prepareStatement(empQry);
			//get the result
			resultset =pstatement.executeQuery();
			Employee emp;
			emplist= new ArrayList<Employee>();
			
			while(resultset.next()) {
				int empid;
				String empName;
				String designation;
				String dept;
				float salary;
				//declare the  pojo
				emp=new Employee();
				//get the row details
				empid=resultset.getInt(1);
				empName=resultset.getString(2);
				designation=resultset.getString(3);
				dept=resultset.getString(4);
				salary=resultset.getFloat(5);
			
				emp.setEmpId(empid);
				emp.setEmpName(empName);
				emp.setDesignation(designation);
				emp.setDept(dept);
				emp.setSalary(salary);
				emplist.add(emp);
				
				emp=null;
				//end of while loop
				//DbConnector.closeConnection();
			}
		}catch(SQLException sqle) {
			
		}finally {
			//close connection
			// now data is in arraylist object, no need to keep the connection opened
			DbConnector.closeConnection();
		}
		return emplist;
		
	}
      public static void showEmpList(ArrayList<Employee>empList2) {
  		
  		for(Employee emp:empList2) {
  			System.out.println(emp.getEmpId());
  			System.out.println(emp.getEmpName());
  			System.out.println(emp.getDesignation());
  			System.out.println(emp.getDept());
  			System.out.println(emp.getSalary());
  			
  		}
  	}
}
    