package com.testng.grouping;

import org.testng.annotations.Test;

public class Group_SearchCase {
	
	@Test(groups="Checklist")
	public void verifyAmazonSearch() {
		
		System.out.println("Search test case");
	}

}
