package methodsOfWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import inheritanceex.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipCartMethods extends BaseTest {
	WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\seleniumproject\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		// keys - keyboard - // send + keys
		//driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"))		.sendKeys("Laptops" + Keys.ENTER);
		// extra click
		// web element
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		ele.sendKeys("Laptops");
		ele.click();
		ele.submit();

		// getText
		String price = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
		String actualPrice = price.substring(1);
		char priceSymbol = price.charAt(0);

		System.out.println(priceSymbol);
		System.out.println(price);
		System.out.println(actualPrice);

		// equals
		if (actualPrice.equals("49,990")) {
			System.out.println("Pass");

		} else
			System.out.println("fail");

		// split
		String a[] = actualPrice.split(",");
		String firstvalue = a[0];
		String secondValue = a[1];

		//concat
		String concat = firstvalue + secondValue;

		// add 10 rupeess
		// Conversion - wrapper classes - recall
		int actualPriceValue = Integer.parseInt(concat);
		System.out.println("actualPriceValue" + actualPriceValue);
		int totalPrice = actualPriceValue + 10;
		System.out.println("totalPrice" + totalPrice);

	}
}