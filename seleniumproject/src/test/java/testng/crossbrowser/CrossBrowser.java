package testng.crossbrowser;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class CrossBrowser extends BaseClass{
	
	@Parameters({ "userName", "pwd" })
	@Test
	public void login(String userName, String pwd) {
		driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
	}

}
