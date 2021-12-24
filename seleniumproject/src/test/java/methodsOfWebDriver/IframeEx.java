package methodsOfWebDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://the-internet.herokuapp.com/tinymce");
		// switch to i-frame with name or Id
		// driver.switchTo().frame("mce_0_ifr");

		// switch to i-frame using web element (any attribute)
		WebElement frameElement
		= driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
		driver.switchTo().frame(frameElement);

		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("test iframe alwal");
		// switch back to main page.
		driver.switchTo().defaultContent();
	//	driver.close();
	}
}
