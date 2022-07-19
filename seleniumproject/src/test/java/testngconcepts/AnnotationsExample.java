package testngconcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsExample {

	@BeforeMethod
	public void openBrowser() {

		System.out.println("Test Case for @Before method - openBrowser");

	}

	@Test // main method
	public void testcase() {

		System.out.println(" @Test - Test Case Execution");

	}

	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Test Case for @AfterMethod - closeBrowser");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Test Case for @beforeClass");
		
	}

	@AfterClass
	public void afterClass() {
		
		System.out.println("Test Case for @AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Test Case for @BeforeTest");
	}


	@AfterTest
	public void afterTest() {
		System.out.println("Test Case for @AfterTest");
	}
	

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Test Case for @BeforeSuite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Test Case for @AfterSuite");

	}

}
