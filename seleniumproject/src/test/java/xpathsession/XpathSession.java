package xpathsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javapackage.StaticKeyword;

public class XpathSession extends StaticKeyword {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
		/*
		 * driver.get("https://www.google.com/");
		 * 
		 * // Xpath
		 * driver.findElement(By.xpath("//input[@name='q']")).sendKeys("JavaSelenium");
		 * 
		 * driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']"
		 * )).click(); driver.navigate().back();
		 */
	
	driver.get("https://www.amazon.com/");
	//driver.findElement(By.id("u_0_2_84")).click();
	
	// Dynamic Xpath -- Starts-with
	//driver.findElement(By.xpath("//a[starts-with(@id, 'u_0_2_')]")).click();

	// contains
	//driver.findElement(By.xpath("//a[contains(@id, 'u_0_2_')]")).click();
 
	// Xpath using OR operator 
	driver.findElement(By.xpath("//*[@id='nav-logo-sprites' or @aria-label='Amazon']")).click();

	// Xpath using AND operator 	
	driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @aria-label='Search']")).sendKeys("Laptops");
	
// inheritance 	
	add();

}
}
