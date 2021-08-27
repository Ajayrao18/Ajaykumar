package com.mycom.collections.list;
import java.util.TreeSet;

public class TreeSetStudentObjectsComparator {

	public static void main(String[] args) {
		
		TreeSet<Students> idcomp=new TreeSet<Students>(new StudentIdComparator());
		idcomp.add(new Students(102,"ram"));
		idcomp.add(new Students(101,"john"));
		idcomp.add(new Students(104,"nolan"));
		idcomp.add(new Students(103,"tom"));
		
		System.out.println("student details sorted by id:\n");
		
		for(Students student:idcomp) {
			System.out.println(student.getId()+"\t"+student.getName());
		}
		
		//by using name comparing(string comparator)
		
		TreeSet<Students> namecomp = new TreeSet<Students>(new StudentNameComparator());
		namecomp.add(new Students(102,"ram"));
		namecomp.add(new Students(101,"john"));
		namecomp.add(new Students(104,"nolan"));
		namecomp.add(new Students(103,"tom"));
		
		System.out.println("student details sorted by name:\n");
		
		for(Students student1:namecomp) {
			System.out.println(student1.getId()+"\t"+student1.getName());
		}
		
	}

}
