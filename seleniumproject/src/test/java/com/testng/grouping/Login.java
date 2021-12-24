package com.testng.grouping;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	//open
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//user Name
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	//password
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	//click on login
	driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
	
	
	
	
}
	

}
