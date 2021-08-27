package com.mycom.collections.list;

import java.util.LinkedHashSet;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedcityset=new LinkedHashSet<String>();
		
		linkedcityset.add("Pune");
		linkedcityset.add("Ahemadabad");
		linkedcityset.add("Nagpur");
		linkedcityset.add("Hyderabad");
		linkedcityset.add("Bengaluru");
       
		for(String city:linkedcityset){
			System.out.println(city);
		}
	}

}
