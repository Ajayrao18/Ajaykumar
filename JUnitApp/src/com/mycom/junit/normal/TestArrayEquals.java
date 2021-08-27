package com.mycom.junit.normal;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import junit.framework.TestCase;

public class TestArrayEquals extends TestCase{
	@Test
	
	public void testArray() {
		String[] expectedOutput={"apple","mango","grape"};
		String[] methodoutput= {"apple","mango","grape"};
		
		assertArrayEquals(expectedOutput, methodoutput);
	}

}
