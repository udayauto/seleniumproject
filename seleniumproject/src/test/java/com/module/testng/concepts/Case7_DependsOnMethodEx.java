package com.module.testng.concepts;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Case7_DependsOnMethodEx {
	
	WebDriver driver = null;
	
	@Test
	public void hrmLogin() {
		
		System.out.println("Login to HRM application");
		Assert.fail();
	}
	
	
	@Test(dependsOnMethods="hrmLogin")
	public void editProfile() {
		
		System.out.println("Login to HRM application");
	}
	
	
	@Test(dependsOnMethods="hrmLogin")
	public void logout() {
		
		System.out.println("Login to HRM application");
	}
	
	@Test @Ignore
	public void closeBrowser() {
		
		System.out.println("Login to HRM application");
	}
	
	
	
}
