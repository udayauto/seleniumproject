package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CollectionEx {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // driver
		
		//object syntax
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com/");
		
		//Find number of Links in Google page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int count = links.size();
		System.out.println(count);
		
		//get text from 0 index --link
		for (int i = 0; i < count; i++) {
			System.out.println(links.get(i).getText()); 
		}
		
		
		
		//index --0
	}

}
