package com.mycom.collections.list;

public class HashCodeFinder {

	public static void main(String[] args) {
		
		String str1="hello";
		String str2="hello";
		
		System.out.println("hash code of str1 --"+ str1.hashCode());
		System.out.println("hash code of str2 --"+ str2.hashCode());
		
		Students student1=new Students(101,"kumar");
		Students student2=new Students(101,"kumar");
		
		System.out.println("hash code of student1 --"+ student1.hashCode());
		System.out.println("hash code of student2 --"+ student2.hashCode());

	}

}
