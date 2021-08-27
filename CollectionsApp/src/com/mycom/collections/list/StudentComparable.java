package com.mycom.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparable {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Students> studentlist=new ArrayList<Students>();
		
		studentlist.add(new Students(101,"vijay"));
		studentlist.add(new Students(105,"Ajay"));
		studentlist.add(new Students(102,"jay"));
		studentlist.add(new Students(105,"Ajay"));

		Collections.sort(studentlist); //compareto() method will be invoked for everey custom object collections
for(Students st:studentlist) {
	System.out.println(st.getId()+""+st.getName());
}
	}

}
