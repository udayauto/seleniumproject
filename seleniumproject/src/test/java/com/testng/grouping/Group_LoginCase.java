package com.testng.grouping;

import org.testng.annotations.Test;

public class Group_LoginCase {
	
	@Test(groups="checklist")
	public void verifyLogin() {
		
		System.out.println(" Login test case");
	}

	@Test(groups="checklist")
	public void verifyPricing() {
		
		System.out.println(" verifyPricing case");
	}
}
