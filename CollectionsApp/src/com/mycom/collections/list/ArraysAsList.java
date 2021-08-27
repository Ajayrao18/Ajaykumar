package com.mycom.collections.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class ArraysAsList {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("alex","charles","brain","david"); //names.add("alex"); names.add("charles")
       for(String name :names) {
    	   System.out.println(name);
       }
       
       System.out.println("list after sorting collections");
       //natural order
       Collections.sort(names,Collections.reverseOrder());
       System.out.println("list after sorting collections in reverse order");
       
       for(String name:names) {
    	   System.out.println(name);
       }
	}

}
