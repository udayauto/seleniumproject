package testng.assertions;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testngsession.BaseClassTest;

public class TestNGAssetionsEx extends BaseClassTest{
	
	@Test
	public void validateTitle() {
		
		startBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		// getTitile
		String expectedTtile ="OrangeHRM";
		String actualTtile = driver.getTitle(); //from application
		
		//validation 
		//Assertion in TestNG ---reporting
		// report your test cases ----PASS/ FAIL
		
		//Hard assertion 
	//	Assert.assertEquals(actualTtile, expectedTtile); //hard break
		
		//Soft Assertion Example
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actualTtile, expectedTtile);
		System.out.println("Execution is Complete");
		
		soft.assertAll();
		
		/*
		 * if(expectedTtile.equals(actualTtile)) {
		 * 
		 * System.out.println("PASS"); }else { System.out.println("FAIL"); }
		 */
	}

}
