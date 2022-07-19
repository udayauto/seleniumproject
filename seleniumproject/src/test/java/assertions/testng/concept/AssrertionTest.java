package assertions.testng.concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browserautomation.ChromeBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import testng.crossbrowser.BaseClass;

public class AssrertionTest extends BaseClass{
	
	@Test
	public void verifyTitle() {
		
		//aa
		//open browser
		startBrowser("chrome");
		
		//open Url
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//verify title
		String expectedTitle="Google Inc";
		String actualTitle = driver.getTitle();
		
		System.out.println("actual Title" + actualTitle);
		
		//hard assertion
		// 		Assert.assertEquals(expectedTitle, actualTitle);
		
		//soft assertion
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println("Execution is Complete");
		
		softassert.assertAll();
		
		//verifications
		/*
		 * if (expectedTitle.equalsIgnoreCase(actualTitle)) {
		 * System.out.println("Pass");
		 * 
		 * }else {
		 * 
		 * System.out.println("fail");
		 * 
		 * }
		 */
		
		
		
		
	}
	
	

}
