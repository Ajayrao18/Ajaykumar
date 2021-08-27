package com.mycom.junit.normal;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;

public class TestCube {
	@Test
	public void testCube() {
		//System.out.println("test case cube");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter test data.."); //input 3
		
		int num=sc.nextInt();
		
	assertEquals(27,Cube.findCube(num));
	assertEquals(-8,Cube.findCube(-2));
	assertEquals(0,Cube.findCube(0));
	}

}
