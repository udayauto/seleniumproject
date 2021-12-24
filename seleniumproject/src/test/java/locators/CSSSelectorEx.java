package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorEx {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// CSS using Id - #
		driver.get("https://www.facebook.com/");
	 //	driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("laptop deals");
	
	  // CSS using Class (.)
		/*
		 * driver.findElement(By.cssSelector("input.nav-input[name='field-keywords']")).
		 * sendKeys("chair -CSS using class"); Thread.sleep(2000);
		 */
	
	// CSS using any attribute
	//	driver.findElement(By.cssSelector("a[aria-label=Amazon]")).click();
		
		// Dynamic CSS using starts with
		driver.findElement(By.cssSelector("[id^='u_0_2_']")).click();
	//	Thread.sleep(5000);
		driver.findElement(By.cssSelector("[name=firstname]")).sendKeys("firstNmae");
	driver.findElement(By.cssSelector("[id='password_step_input']")).sendKeys("Password");
	driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("7865442662");

	}

}
