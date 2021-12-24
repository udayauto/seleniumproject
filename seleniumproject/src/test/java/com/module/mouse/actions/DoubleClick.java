package com.module.mouse.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		
		// Open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Test case
		// Navigate
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

		// double click 
		action.doubleClick(button).perform();
		
		// Handle Alert 
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		 
	}
}
