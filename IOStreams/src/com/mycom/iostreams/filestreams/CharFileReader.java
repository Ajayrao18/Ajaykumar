package com.mycom.iostreams.filestreams;
import java.io.FileReader;
import java.io.IOException;
public class CharFileReader {

	public static void main(String[] args) throws IOException {
		
   //creates an array of character
		char[] array=new char[50];
		FileReader input=null;
		
		try {
			//creates a reader using the FileReader
			input=new FileReader("d:\\empchar.txt");
			//reads characters
			input.read(array);
			System.out.println("data in the file");
			System.out.println(array);
		}catch(Exception e){
			e.getStackTrace();
	}
		finally {
			//close the reader
			input.close();
		}

}
}
	
