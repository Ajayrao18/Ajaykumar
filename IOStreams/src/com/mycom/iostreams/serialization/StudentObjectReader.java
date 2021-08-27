package com.mycom.iostreams.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class StudentObjectReader {

	public static void main(String[] args) throws IOException {
		Student students[]=new Student[5];
       
		for(int index=0;index<students.length;index++) {
		  students[index]=null;
		}
		FileInputStream fis=new FileInputStream("d:\\student.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		try {
			System.out.println("student objects being deserialized");
			
			for(int index=0;index< students.length;index++) {
				students[index]=(Student)ois.readObject(); //reference casting
				
				System.out.println("\n\nStudent"+(index+1)+"details!");
				System.out.println("StudentRollNo"+students[index].getSturollnum());
				System.out.println("Student name"+students[index].getStuname());
				System.out.println("Student age"+students[index].getStuage());
				System.out.println("Student address"+students[index].getStuAddress());
			}
			System.out.println("\n Done");
			//ois.close();
			//fis.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
			return;
		}catch(ClassNotFoundException cnfe) {
			System.out.println("student.ser file is not found");
			cnfe.printStackTrace();
		}finally {
			ois.close();
		}
	}

}
