package com.mycom.collections.list;
import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		ArrayList<String> langlist=new ArrayList<String>();
		
		langlist.add("Java");
		langlist.add("Python");
		langlist.add("C++");
        System.out.println("ArrayList"+ langlist);
        
        System.out.println("deleting python");
        
        String str=langlist.remove(1); //using index
       System.out.println("removed string object from collection is ---"+str);
       System.out.println("ArrayList"+ langlist);
       
       
       boolean hasRemoved=langlist.remove("Java"); //using object
       if(hasRemoved) {
    	   System.out.println("the object java has been removed");
       }else {
    	   System.out.println("the object java has not founf");
       }
       langlist.add("Python");
       System.out.println(langlist);
       
       boolean hasremoved2=langlist.remove("java");
       if(hasremoved2) {
    	   System.out.println("the object has been removes");
       }else {
    	   System.out.println("the object not found");
       }
	}

}
