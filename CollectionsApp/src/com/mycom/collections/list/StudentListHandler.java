package com.mycom.collections.list;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentListHandler {

	public static void main(String[] args) {
	 Student student=new Student();
	 //to add student pojos to array list
	 ArrayList<Student> studentlist=new ArrayList<Student>();
     Scanner sc=new Scanner(System.in);
     int choice;
     
     while(true) {
    	 System.out.println("1.Add Students 2.Read Students 3.Exit");
    	 choice=sc.nextInt();
    	 switch(choice) {
    	 case 1:
    		 System.out.println("enter studentid,name,marks");
    		 
    		 student.setId(sc.nextInt());
    		 sc.nextLine();
    		 student.setName(sc.nextLine());
    		 student.setMarks(sc.nextFloat());
    		 sc.nextLine();
    		 //add the student object to studentlist
    		 studentlist.add(student);
    		 student=null;
    		 student=new Student();
    		 break;
    		 
    	 case 2:
    		 System.out.println("student details!");
    		 //collections.sort (list<student>)studentList);
    	   for(Student studentobj:studentlist) {
    		   System.out.println("student id "+ studentobj.getId()+"\tstudent name "+studentobj.getName()+"\tstudentmarks "+studentobj.getMarks());
    	   }
    	   break;
    	   
    	 case 3: 
    		 System.out.println("thank you for using app");
    		 sc.close();
    		 System.exit(0);
    		 break;
    	 }
     }
	}

}
