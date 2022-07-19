package com.testng.grouping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	@Test(groups="Checklist")
	public void launchApplication() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	System.out.println("launchApplication");
	System.out.println(driver.getTitle());
}
}
