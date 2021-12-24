package testngsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest {
	// common functions or methods

	public WebDriver driver=null;
	
	// Open browser
	public void startBrowser(String browser) {

		// chrome
		if (browser.equalsIgnoreCase("chrome")) {
			// open application
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} //edge browser
		else if (browser.equalsIgnoreCase("edge")) {
			// open application
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}else if (browser.equalsIgnoreCase("firefox")) {
			// open application
			WebDriverManager.firefoxdriver().setup();;
			driver = new FirefoxDriver();
		}

	}

	
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	public void waitForElementPresent(int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);

	}
}
