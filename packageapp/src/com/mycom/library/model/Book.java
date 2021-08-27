package com.mycom.library.model;

public class Book {
	//all the instance variables below have package scope
int id;
String name;
String author;
float price;
public Book(int id, String name, String author, float price) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = price;
}

public void showBokdetails() {
	System.out.println(id +"\t"+ name +"\t" +author+"\t"+price);
}
}
