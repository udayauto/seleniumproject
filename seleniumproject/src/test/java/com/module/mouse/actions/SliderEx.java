package com.module.mouse.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderEx {

	public static void main(String[] args) {
		
		//open browser 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	
		// Test case
		// Navigate
		driver.get("https://demoqa.com/slider");

		Actions action = new Actions(driver);
		// WebElement button =
		// driver.findElement(By.xpath("//button[text()='Double-Click Me To See
		// Alert']"));

		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

		// Slider
		//	action.dragAndDropBy(slider, 100, 200).perform();
		
		//another way
		action.moveToElement(slider).dragAndDropBy(slider, 150, 150).perform();

	}
}
