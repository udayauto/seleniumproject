package com.testng.parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	WebDriver driver = null;

	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			// Open browser
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority=2)
	@Parameters("keyword")
	public void search(String keyword) {

		driver.findElement(By.name("q")).sendKeys(keyword);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
