package com.mycom.junit.normal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class TestAdminStringReader {
        @Test
	public void testsetup() {
		AdminString adminstrreader=new AdminString(); //business class object for testing
		
		String str=adminstrreader.readString();
		
		assertEquals(true,str.equalsIgnoreCase("Admin"));
		assertTrue(str.equalsIgnoreCase("admin"));
	}
	
}
