package com.waits.sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1_ImplictWaitFbEx {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id, 'u_0_2_')]")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("783468665");
		
}
	
}
