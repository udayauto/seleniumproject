package moduleNext1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testngsession.BaseClassTest;

public class TakeScreenshotExample extends BaseClassTest{
	@Test
	public void takeScreenshot() throws Exception {
		startBrowser("chrome");
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 */
		driver.get("https://www.emirates.com/in/english/");
		
		//initialize ref var and convert driver to take screenshot interface --type casting
		//type casting.... 
		TakesScreenshot capture = (TakesScreenshot)driver;

		// capture screenshot
		File source = capture.getScreenshotAs(OutputType.FILE);
		
		// provide destination where screensot will be saved.
		String path = "C:\\workspace\\seleniumproject\\src\\test\\resources\\screenshot";
		File destFile = new File(path+"\\screenshot.jpg");
		
		FileUtils.copyFile(source, destFile);
	}

}
