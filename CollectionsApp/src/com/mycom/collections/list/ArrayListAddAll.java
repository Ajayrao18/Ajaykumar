package com.mycom.collections.list;

import java.util.ArrayList;

public class ArrayListAddAll {

	public static void main(String[] args) {
		ArrayList<String>citylist=new ArrayList<>(); //list1
		
		citylist.add("bengaluru");
		citylist.add("hyderabad");
		
		ArrayList<String>citylist2=new ArrayList<>(); //list2
        
		citylist2.add("erode");
		citylist2.add("pune");
		
		citylist.addAll(citylist2);
		
		System.out.println(citylist); //combined list
	}

}
