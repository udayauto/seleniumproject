package moduleNext1;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testngsession.BaseClassTest;

public class HighlightScreeenshot extends BaseClassTest {
	@Test
	public void takeScreenshot() throws IOException, InterruptedException {
		// startBrowser("chrome");
		WebDriverManager.chromedriver().setup();WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement inputBox = driver.findElement(By.xpath("//input[@title='Search']"));

		// highlight screenshot - use java script executor
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", inputBox);
		
		Thread.sleep(3000);
		TakesScreenshot capture = ((TakesScreenshot) driver);
		// capture screenshot
		File source = capture.getScreenshotAs(OutputType.FILE);
		// provide destination where screensot will be saved.
		String path = "C:\\workspace\\seleniumproject\\src\\test\\resources\\screenshot";
		File destFile = new File(path + "\\screenshot2.jpg");
		FileUtils.copyFile(source, destFile);
	}
}
