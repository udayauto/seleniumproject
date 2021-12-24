package com.testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {

	@Parameters({"userName", "password"})
	@Test
	public void loginFunctionality(String userName, String password) {

		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// open application
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// lOgin
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

}
