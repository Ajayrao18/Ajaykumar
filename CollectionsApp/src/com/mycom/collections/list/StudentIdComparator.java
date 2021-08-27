package com.mycom.collections.list;
import java.util.Comparator;

public class StudentIdComparator implements Comparator<Students>{

	@Override
	public int compare(Students student1, Students student2) {
		if(student1.getId()>student2.getId()) {
			return 1;
		}else {
			return -1;
		}
	
	}

}
