package com.waits.sync;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Case2_WebDriverWaitElementToBeClickable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		//implicit wait
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/waitcommands.html");
		//driver.findElement(By.linkText("LinkText-5")).click();
	
		//Explicit wait
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 10); 
		 * WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-2"))
		 * ); ele.click();
		 */
		// Fluent wait
		 FluentWait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
				 .withTimeout(30, TimeUnit.SECONDS)
			        .pollingEvery(1, TimeUnit.SECONDS)
			        .ignoring(NoSuchElementException.class);

		 fluentwait.until(ExpectedConditions.elementToBeClickable(By.linkText("LinkText-2"))).click();


}

}
	