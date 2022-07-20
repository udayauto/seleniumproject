package browserautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Launch browser
		
		//change.
		
		  WebDriverManager.chromedriver().setup(); 
		  WebDriver driver = new ChromeDriver();
		 	
		
		//Get Info from browser or application
		  driver.get("https://www.google.com/");
		  System.out.println("Application Titile: " + driver.getTitle()); // Get Titile
		  System.out.println("Application URL : " + driver.getCurrentUrl());
		 
			//System.out.println("Page source: " + driver.getPageSource());
			
		// Close browser
		/*
		 * driver.close(); // current browser session driver.quit(); // close all the
		 * browser sessions opened by selenium
		 */			
		//navigate
			driver.navigate().to("https://www.google.com/");
			Thread.sleep(5000);
			driver.navigate().forward();
			//driver.navigate().back();
			driver.navigate().refresh();
			
		//Actions ----> Locators 
		//verification
			
	}
	

}
