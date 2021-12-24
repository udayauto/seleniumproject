package xpathsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathparttwo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		// Xpath using Text() function
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
	
	String expectedText = "Create Facebook Account";
	
	String actualText = driver.findElement(By.xpath("//*[text()='Create New Account']")).getText();
		
	// validation
		if (actualText.equalsIgnoreCase(expectedText)) {
			
			System.out.println("PASS: Text does match as expected");
	
		} else {
			System.out.println("FAIL: Text doesn't match: " + " " + actualText);
			System.out.println(" Expected text : " + expectedText );
		}
		
		
	}

}
