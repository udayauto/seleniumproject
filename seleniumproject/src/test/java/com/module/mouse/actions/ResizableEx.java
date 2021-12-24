package com.module.mouse.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizableEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Test case
		// Navigate
		driver.get("https://jqueryui.com/resizable/");
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		 */
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		
		// Re-sizable
		// action.moveToElement(button).dragAndDropBy(button, 200, 200).perform();

		action.dragAndDropBy(button, 150, 200).build().perform();;
		
		action.moveToElement(button).moveByOffset(500, 400);

	}
}

