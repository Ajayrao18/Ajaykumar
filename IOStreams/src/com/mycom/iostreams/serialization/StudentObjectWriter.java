package com.mycom.iostreams.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class StudentObjectWriter {

	public static void main(String[] args) throws IOException {
		Student students[]=new Student[5];
		
		students[0]=new Student(101,30,"arun","araku");
		students[1]=new Student(102,30,"arun","araku");
		students[2]=new Student(103,30,"arun","araku");
		students[3]=new Student(104,30,"arun","araku");
		students[4]=new Student(104,30,"arun","araku");

		FileOutputStream fos =new FileOutputStream("d:\\student.ser");// if file is variable then new data will be appended
		ObjectOutputStream oos=new ObjectOutputStream(fos); //wrapper -wraps fileoutputStream object
		
		try {
			//serialize all 5 student objects
			for(int index=0; index<5;index++) {
				oos.writeObject(students[index]);
				oos.flush();
			}
			System.out.println("student details has been serialized");
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
     finally {
    	 oos.close();
     }
     
	}

}
