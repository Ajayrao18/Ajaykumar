package com.mycom.collections.list;

import java.util.TreeSet;

public class TreeSetForEach {

	public static void main(String[] args) {
		TreeSet<String>langset=new TreeSet<String>();
   langset.add("Java");
   langset.add("C");
   langset.add("java script");
   langset.add("Python");
   langset.add("C++");
   langset.add("java script");
   
   for(String lang:langset) {
	   System.out.println(lang);
   }
	}

}
