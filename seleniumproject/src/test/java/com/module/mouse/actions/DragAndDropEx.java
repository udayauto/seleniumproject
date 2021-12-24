package com.module.mouse.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropEx {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		// Test case
		// Navigate
		driver.get("https://jqueryui.com/droppable/");

		// mouseOver at Mens section
		// moveToElement
		

		// switch to iframe
		driver.switchTo().frame(0);

		// DargAnd Drop
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		//mouse event --actions
		Actions action = new Actions(driver);
		action.dragAndDrop(source, dest).perform();
		
		
		
		// drag and drop - One way
		//action.dragAndDrop(source, target).perform();
		
		
		// another way
		//action.clickAndHold(source).moveToElement(target).release().perform();

		// 2nd way
		// clickAndHold
		// moveToElement
		// release
		//action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

	}

}
