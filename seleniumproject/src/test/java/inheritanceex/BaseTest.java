package inheritanceex;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	String expectedTitle = "Google";
	public static int i = 0;

	//@BeforeClass
	public void startBrowser() {

		System.out.println("Open Super Browser");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");

	}

	//@AfterClass
	public void closeBrowser() {
		driver.close();

		System.out.println("close browser");
	}

	public static void switchToChildWindow() {
		Set<String> windows = driver.getWindowHandles();
		// System.out.println("windows id: " + windows);
		System.out.println("windows count" + windows.size());

		for (String child : windows) {
			System.out.println("window: " + i + ": " + child);

			if (i == 1) {
				driver.switchTo().window(child);
			}
			i++;
		}

	}

	
}
