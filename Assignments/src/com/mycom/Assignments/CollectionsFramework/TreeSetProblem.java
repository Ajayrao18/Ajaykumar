package com.mycom.Assignments.CollectionsFramework;

import java.util.TreeSet;

public class TreeSetProblem {

	public static void main(String[] args) {//in TreeSet it takes duplicates and follow  sorted order
		TreeSet<String>Countries=new TreeSet<>(); //Problem Statement 1
	      Countries.add("India");
	      Countries.add("Australia");
	      Countries.add("england");
	      Countries.add("Zimbabwe");
	      Countries.add("Russia");
	      System.out.println("Problem Statement 1");
	      System.out.println("List of Five Countries");
			System.out.println(Countries);
			
			
			TreeSet<Integer>Values=new TreeSet<>(); //Problem Statement 2
		      Values.add(1);
		      Values.add(2);
		      Values.add(3);
		      Values.add(4);
		      Values.add(5);
		      Values.add(6);
		      Values.add(7);
		      Values.add(8);
		      Values.add(9);
		      Values.add(10);
		      System.out.println("Problem Statement 2");
		      System.out.println("Values 1-10: ");
		     System.out.println(Values);
		     
			
		     TreeSet<Integer>Values2=new TreeSet<>(); //Problem statement 3
		      Values2.add(11);
		      Values2.add(12);
		      Values2.add(13);
		      Values2.add(14);
		      Values2.add(15);
		      Values2.add(14);
		      Values2.add(15);
		      
		      Values.addAll(Values2);
		      System.out.println("problem Statement 3");
		      System.out.println("Adding values 11-15 to existing TreeSet 1-10 using for loop");
		      for(Integer IntegerValues:Values) {
		    	  System.out.print(IntegerValues+",");
		      }
	}

}
