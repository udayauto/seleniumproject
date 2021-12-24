package handing.iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameEx {

	public static void main(String[] args) throws InterruptedException {
		//open browser
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open applciation
		driver.get("http://the-internet.herokuapp.com/tinymce");

		// switch to frame

		/*
		 * driver.switchTo().frame(0); Thread.sleep(2000);
		 * driver.findElement(By.id("tinymce")).clear();
		 * driver.findElement(By.id("tinymce")).sendKeys("Happy Saturday -- Diwali");
		 */
		// Method-2

		/*
		 * driver.switchTo().frame("mce_0_ifr");
		 * driver.findElement(By.id("tinymce")).clear();
		 * driver.findElement(By.id("tinymce")).sendKeys("Happy Saturday -- Diwali");
		 */


		// Method 3
		WebElement iframeElement = driver.findElement(By.xpath("//*[@class='tox-edit-area__iframe']"));
		driver.switchTo().frame(iframeElement);
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Happy Saturday -- Diwali");

    // overloading ---
	// overriding --inheritance
		
	}
}
