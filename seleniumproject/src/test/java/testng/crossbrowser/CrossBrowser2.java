package testng.crossbrowser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CrossBrowser2 extends BaseClass{
	@Test
	public void repo() {
	
	SoftAssert soft = new SoftAssert();
		String actualText = driver.findElement(By.xpath("//h1[text()='Sign in to GitHub']")).getText();
	
		soft.assertEquals("Sign in to GitHub", actualText);
		
		System.out.println("Execution is complete");
	}

}
