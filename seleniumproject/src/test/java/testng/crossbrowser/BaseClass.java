package testng.crossbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver = null;

	/*
	 * @Parameters("browser")
	 * 
	 * @BeforeMethod
	 */
	public void startBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			// Open browser
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		//driver.get("https://github.com/login");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
