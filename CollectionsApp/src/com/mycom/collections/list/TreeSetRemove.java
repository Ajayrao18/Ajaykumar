package com.mycom.collections.list;

import java.util.TreeSet;

public class TreeSetRemove {

	public static void main(String[] args) {
		TreeSet<String>langset=new TreeSet<String>();
		   langset.add("Java");
		   langset.add("Python");
		   langset.add("C++");
		   langset.add("C");
		   langset.add("Angular");
		   langset.add("React");
		   langset.add("Node");
System.out.println("Treeset"+langset);

System.out.println("deleting C++");
//boolean str=langset.remove(0);
//System.out.println(str);

langset.remove("C++");
System.out.println("TreeSet"+langset);
	}

}
