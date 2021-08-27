package com.mycom.collections.list;

import java.util.HashSet;

public class HashSetLanguageAddAll {

	public static void main(String[] args) {
		// create array list
		HashSet<String>langset=new HashSet<String>();
		//add() method without index
		
		langset.add("Java");
		langset.add("C");
		langset.add("Python");
		System.out.println("hashset "+ langset);
		
		HashSet<String>langset2=new HashSet<String>();
		langset2.add("Node js");
		langset2.add("Angular js");
		langset2.add("Node js");
		System.out.println("array list2"+ langset2);
          System.out.println("adding langset2 to langset");
          
          
          langset.addAll(langset2);
          System.out.println("language list after update"+ langset);
	}

}
