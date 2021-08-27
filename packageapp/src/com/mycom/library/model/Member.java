package com.mycom.library.model;

public class Member {
int id;
String name;
public Member(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public void showbookname() {
	Book book=new Book(1,"dfdg","gfdd",546);
	book.showBokdetails();
	System.out.println(book.name);
	System.out.println(id+"\t"+name);
}


}
