package mouseevents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickExample {
	public static void main(String[] args) {
		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open application ---
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		WebElement rightClick = driver.findElement(By.xpath("//*[contains(text(), 'right click me')]"));

		Actions action = new Actions(driver);
		// right click ----context click
		//action.contextClick(rightClick).perform();

		action.moveToElement(rightClick).contextClick().perform();

		// click on element ---copy
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"))
		.click();

		// Alert --handling

		Alert anil = driver.switchTo().alert();
		String text = anil.getText();

		System.out.println(text);

		// accept ---close alert
		anil.accept();

	}
}
