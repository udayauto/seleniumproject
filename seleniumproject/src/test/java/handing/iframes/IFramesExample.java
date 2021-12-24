package handing.iframes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesExample {
	
	public static void main(String[] args) throws InterruptedException {
		//open browser
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		// click on Actions link from iFrame 1
	   // switch to iFrame
		
		// Method#1 ---------by Index
		/*
		 * driver.switchTo().frame(0);
		 * //driver.findElement(By.linkText("Actions")).click(); Thread.sleep(3000);
		 * driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		 */
		
		// Method #2 ----------
		
		/*
		 * driver.switchTo().frame("classFrame"); Thread.sleep(3000);
		 * driver.findElement(By.linkText("NO FRAMES")).click();
		 */

		// Method #3 - any WebElement----
		
		// Method #4 ----- more than one iFrame
		/// how many iframes 
		
		List<WebElement> listFrames = driver.findElements(By.tagName("iframe"));
		int count = listFrames.size();
		
		System.out.println("ifrmaes count is -- : " + count);
		
		//switch to iframe
		driver.switchTo().frame(listFrames.get(2));
		driver.findElement(By.linkText("NO FRAMES")).click();

		
	}

}
