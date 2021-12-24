package mouseevents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleCLickExam {
	
	public static void main(String[] args) {
		
		//open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	//	open application ---myntra
		driver.get("https://www.myntra.com/");
		
		// Mouse actions -------perform
		WebElement mensSection = driver.findElement(By.xpath("//a[@data-group='men']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mensSection).perform(); //hover
		
		// click on sweaters
		driver.findElement(By.xpath("//a[normalize-space()='Sweaters']")).click();
		
	}

}
