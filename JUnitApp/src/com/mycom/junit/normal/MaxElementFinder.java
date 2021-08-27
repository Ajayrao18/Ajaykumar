package com.mycom.junit.normal;

public class MaxElementFinder {
	
	public int findMax(int arr[]) {
		//int max=0;
		//initialize max wuth least value of int data range
		int max=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
		}
		
		
		return max;
		
	}

}
