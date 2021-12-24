package testngdemopak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLoginAnnotationsEx {
	WebDriver driver=null;

	
	@Test
	public void veifyLoginFunctionality() {

		// opeb appliation
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// input username and pwd
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// hit Login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}
	
	@BeforeClass
	public void openbrowser() {

		// open a browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


	@AfterClass
	public void tearDown() {

		driver.close();

	}

}
