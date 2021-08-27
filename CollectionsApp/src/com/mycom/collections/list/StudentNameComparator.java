package com.mycom.collections.list;
import java.util.Comparator;
public class StudentNameComparator implements Comparator<Students> {
	

public int compare(Students student1, Students student2) {
	return student1.getName().compareTo(student2.getName());
	
}


}