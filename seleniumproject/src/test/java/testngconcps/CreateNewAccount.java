package testngconcps;


import org.testng.annotations.*;
import org.testng.annotations.Test;

public class CreateNewAccount {
	
	// test case
	// feature ---CreateNewAccount 
	
	
	@BeforeMethod
	public void testCaseBefore() {
		System.out.println("Open browser");
	}
	
	
	@Test
	public void testCase1() {
		System.out.println("Test case1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test case2");
	}
	

	@Test
	public void testCase3() {
		System.out.println("Test case3");
	}
	
	@AfterMethod
	public void testCaseAfter() {
		System.out.println("close the session");
	}
	
}
