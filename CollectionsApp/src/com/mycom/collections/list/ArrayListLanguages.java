package com.mycom.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLanguages {

	public static void main(String[] args) {
		//create arraylist
		
		ArrayList<String>LangList=new ArrayList<String>();//generics
		
		//add elements to ArrayList
		LangList.add("C");
		LangList.add("Java");
		LangList.add("Python");
		LangList.add("Java Script");
		
		System.out.println("before language is sorting");
		
		for(String lang:LangList) {
			System.out.println(lang);
		}
		Collections.sort(LangList);
		
		System.out.println("After language is sorting");
		
		for(String lang:LangList) {
			System.out.println(lang);
		}
	}

}
