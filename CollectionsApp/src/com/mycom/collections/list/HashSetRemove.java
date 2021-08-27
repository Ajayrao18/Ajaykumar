package com.mycom.collections.list;

import java.util.HashSet;

public class HashSetRemove {

	public static void main(String[] args) {
		HashSet<String> langset=new HashSet<>();
		
		//add elements in array list
		langset.add("Java");
		langset.add("Python");
		langset.add("C++");
		System.out.println("hashset"+langset);
		
		System.out.println("deleting java");
		@SuppressWarnings("unlikely-arg-type")
		boolean isRemoved =langset.remove(0);
		System.out.println("is langset(0)removed..?"+ isRemoved);
		
		langset.remove("C++");
		
		System.out.println("language set after deleting c++");
		
		System.out.println("hashset: "+langset);
		
	}

}
