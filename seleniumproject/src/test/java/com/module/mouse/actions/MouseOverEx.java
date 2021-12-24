package com.module.mouse.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverEx {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Test case 
		// Navigate
		driver.get("https://www.myntra.com/");
		
		// mouseOver at Mens section 
		//moveToElement 
		
		Actions action = new Actions(driver);
		
		WebElement eleMenSection = driver.findElement(By.xpath("//a[@class='desktop-main' and @data-group='men']"));
		action.moveToElement(eleMenSection).perform();
		
		// Click on category
		driver.findElement(By.xpath("//div[@class='desktop-paneContent']//a[@href='/men-tshirts']")).click();

	}

}
