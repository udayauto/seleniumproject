package testngdemopak;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLoginBeforeAnnotationsEx2 {
	WebDriver driver=null;

	@BeforeMethod
	public void openbrowser() {

		// open a browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// opeb appliation
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@Test
	public void veifyLoginFunctionality() {
		// input username and pwd
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// hit Login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}
	
	@Test
	public void verifyLogoHomepage() {
		
	WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));

	if (logo.isDisplayed()) {
		System.out.println("Company Brand image logo is displayed");
		
	}else {
		System.out.println("Company Brand image logo is NOT displayed");

	}
	}

	@AfterMethod
	public void tearDown() {

		driver.close();

	}

}
