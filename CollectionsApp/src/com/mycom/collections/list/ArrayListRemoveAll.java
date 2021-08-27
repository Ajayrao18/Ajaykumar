package com.mycom.collections.list;
import java.util.ArrayList;
import java.util.List;
public class ArrayListRemoveAll {

	public static void main(String[] args) {
		//create array list
		List <String> languages1=new ArrayList();
		
		languages1.add("Java");
		languages1.add("English");
		languages1.add("C");
		languages1.add("Spanish");
		System.out.println("languages1"+languages1);
		
		//create another array list
		ArrayList<String> languages2=new ArrayList<>();
		languages2.add("English");
		languages2.add("Spanish");
		languages2.add("French");
		System.out.println("languages2"+languages2);
		
		//remove all elements of arraylist2 from arraylist1 -objects that are commom
       //objects that are availavble in languages2 which are common in languages1 wiil be removed
		
		languages1.removeAll(languages2);
		
		System.out.println("languages1"+ languages1);
		System.out.println("languages2"+ languages2);
		
		System.out.println("are objects available in language1?"+ languages1);
	}

}
