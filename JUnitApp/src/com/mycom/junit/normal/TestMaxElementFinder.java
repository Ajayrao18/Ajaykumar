package com.mycom.junit.normal;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMaxElementFinder {

	@Test
	
	public void  testFindMax() {
		
		MaxElementFinder maxelmfinder =new MaxElementFinder();
		int scores[]= {50,3,4,-4,0}; //test data
		
		int max=maxelmfinder.findMax(scores);
		
		assertEquals(50,maxelmfinder.findMax(scores));
	}
}
