package com.mycom.iostreams.filestreams;
import java.io.FileInputStream;

import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("d:\\empbyte.txt");
    try{
    	System.out.println("filesize:"+ fis.available());//returnsfilesize
    	String str =new String();
    	
    	while (fis.available()>0) {
    		char ch=(char)fis.read();//reads a character at a time
    		str=str+ch;
    	}//the file data is in 'str'
    	
    	String emp1[];
    	emp1=str.split("\n");
    	//emp1[0]-->1234,kumar,manager,5454
    	System.out.println("first employe details");
    	System.out.println(emp1[0]);
    	
    	System.out.println("\n\nSecond employe details");
    	System.out.println(emp1[1]);
    }catch(Exception e) {
    	System.err.println("error reading file"+e);
    }
    finally {
    	fis.close();
    }
	}

}
