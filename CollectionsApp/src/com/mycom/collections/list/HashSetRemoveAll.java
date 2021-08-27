package com.mycom.collections.list;

import java.util.HashSet;

public class HashSetRemoveAll {

	public static void main(String[] args) {
		HashSet<String>language1=new HashSet<>();
		
		language1.add("Java");
		language1.add("English");
		language1.add("C");
		language1.add("Spanish");
		System.out.println("language1"+language1);
		
		//create another list
		
		HashSet<String>language2=new HashSet<>();
		language2.add("English");
		language2.add("Spanish");
		System.out.println("language2"+language2);
		
		//remove all elements of hashset2 from hashset1 -objects that are common in both list will be removed
		
		language1.removeAll(language2);
		System.out.println("language1 after removeall"+language1);
		System.out.println("language2 after removeall"+language2);
		language2.clear();
		System.out.println("language1"+language2.isEmpty());
	}

}
