package com.mycom.iostreams.filestreams;

import java.io.FileWriter;
import java.io.IOException;

public class CharFileWriter {

	public static void main(String[] args) throws IOException {
		String data="4567,prasad,admin,7894\n";
		FileWriter output=null;
		try {
			//creates a file
			output=new FileWriter("d:\\empchar.txt",true); //appends data to the existing file
			
			//writes the string to the file
			output.write(data);
			//cleans the stream/memory
			output.flush();
			System.out.println("file has been created");
		}catch(Exception e) {
			e.getStackTrace();
		}
		finally {
			output.close();
		}

	}

}
