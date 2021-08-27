package com.mycom.collections.list;
import java.util.HashSet;

public class HashSetForEach {

	public static void main(String[] args) {
		HashSet<String> langset=new HashSet<String>(); //unordered collection
		
		//add() method without the index parameter
		
		langset.add("Java");
		langset.add("C");
		langset.add("Python");
		langset.add("Java Script");
		langset.add("Python");
		
		//repeating the same set of objects
		
		langset.add("java"); //will add
		langset.add("C"); //not add
		langset.add("Python"); //not add
		langset.add("Java Script"); //not add
		langset.add("Python"); //not add
		
		for(String lang:langset) {
			System.out.println(lang);
		}
		
		HashSet<Integer>intset=new HashSet<Integer>();
		intset.add(100);
		intset.add(200);
		
		System.out.println(intset);
		
		intset.remove(200);
		
		System.out.println(intset);

	}

}
