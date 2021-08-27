package com.mycom.iostreams.filestreams;


import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("d:\\empbyte.txt");

		String str1="123,kumar,manager,85648\n";
		String str2="124,ajay,ceo,4645445\n";
		
		try {// now write to the buffered stream
			fos.write(str1.getBytes()); //getbytes- convert string character into 'byte' datatype
			fos.flush(); //ensures complte data write
			
			fos.write(str2.getBytes());
			fos.flush();
		}catch(Exception e) {
			System.err.println("error writing file"+ e);
		}
		finally {
			fos.close();
		}
	}

}
