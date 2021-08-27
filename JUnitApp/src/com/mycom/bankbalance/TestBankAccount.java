package com.mycom.bankbalance;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
public class TestBankAccount extends TestCase {
	 
	BankAccount acc=new BankAccount(100);;
	
	@Before
	public void setuptestDepositUpdatesBalance() {
		acc=new BankAccount(100);
	}
	
	@After 
	public void tearDown() {
		acc=null;
	}
	@Test
	public void testdeposit() {
		//no need to instantiatiate a new BankAccount @before does it for us
		acc.withdraw(40);
		assertEquals(acc.getBalance(),60); //pass
		
	}
	
	@Test
	public void testWithdrawAppliesPenalityWhenOverDrawn() {
		acc.withdraw(120);
		assertEquals(acc.getBalance(),-20); 	
	}

	
}
