package com.mycom.junit.normal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class StringMessage {

	@Test //testsetup() is the method that tests the unit
public void testsetup() {
		
		String str="iam done with junit setup";
		assertEquals("iam done with junit setup",str);
	
}
		

}


