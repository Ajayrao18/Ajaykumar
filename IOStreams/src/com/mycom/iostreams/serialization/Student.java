package com.mycom.iostreams.serialization;

public class Student implements java.io.Serializable {

	private int sturollnum;
	private int stuage;
	private String stuname;
	private transient String stuAddress;
	//transient -attributes will not persist while serializing or data will not store in file while using "transient"  
	public Student(int sturollnum, int stuage, String stuname, String stuAddress) {
		super();
		this.sturollnum = sturollnum;
		this.stuage = stuage;
		this.stuname = stuname;
		this.stuAddress = stuAddress;
	}
	public int getSturollnum() {
		return sturollnum;
	}
	public void setSturollnum(int sturollnum) {
		this.sturollnum = sturollnum;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	
	
}
