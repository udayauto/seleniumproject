package mouseevents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickEx {
	public static void main(String[] args) {

		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open application ---
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		// webelement
		WebElement dclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

		//Actions
		Actions action = new Actions(driver);
		//double click 
		action.doubleClick(dclick).perform();
		
		
		
	}

}
