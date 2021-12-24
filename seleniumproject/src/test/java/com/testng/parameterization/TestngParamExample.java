package com.testng.parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngParamExample {

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
		driver.get("https://github.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Parameters({ "userName", "pwd" })
	@Test
	public void login(String userName, String pwd) {
		driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='commit']")).click();
	}

	@Test(priority=1)
	public void tearDown() {
		driver.get("https://intellipaat.com/");
	}

}
