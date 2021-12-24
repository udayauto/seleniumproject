package moduleNext1;
import java.io.File;
import java.io.FileNotFoundException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {
	
	@Test
	public void takeScreenshot() {
		
		try {
		//startBrowser("chrome");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Emirates website
		driver.get("https://www.emirates.com/in/english/");
		
		// TakeScreenshot 
		//initialize ref var and convert driver to take screenshot interface --type casting
		TakesScreenshot capture = (TakesScreenshot)driver;
		
		// capture sccreeshot
		File source = capture.getScreenshotAs(OutputType.FILE);
		
		// target location
		String path = "C:\\workspace\\seleniumproject\\src\\test\\resources\\screenshot\\emirates.png";
		File target = new File(path);
		
		//copyfile to target location.
		
			FileUtils.copyFile(source, target);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("This exception belongs screenshot capture");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// known
}
}