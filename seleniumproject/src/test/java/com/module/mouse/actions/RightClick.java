package com.module.mouse.actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {

		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// step1: open application.
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
		//Step2 - Locate an element called button.
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		//Actions class 
		Actions action = new Actions(driver);
		action.contextClick(button).perform();

		// click on Copy button
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"))
		.click();

		// action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		// action.doubleClick();

		// Handle Alert 
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
