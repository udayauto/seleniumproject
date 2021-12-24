package window;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowhandleBestEx {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.officedepot.com/");
		driver.findElement(By.linkText("Credit Cards")).click();
		driver.findElement(By.xpath(
				"//a[@href='https://www.officedepot.com/business-credit-account-apply?cm_sp=credit_promotions-_-BUSINESS-ACCOUNT_apply-now_-_-&promo_name=credit_promotions&promo_id=credit_promotions-BUSINESS-ACCOUNT-apply-now&promo_creative=BUSINESS-ACCOUNT_apply-now'][normalize-space()='Apply Now']"))
				.click();

		// System.out.println(driver.getCurrentUrl());
		// parent window
		String parentId = driver.getWindowHandle();
		System.out.println("parentId:" + parentId);
		Set<String> windows = driver.getWindowHandles();
		System.out.println("windows.size" + windows.size());

		ArrayList<String> windowlist = new ArrayList<String>(windows);
		// switch to child window
		driver.switchTo().window(windowlist.get(1));
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		if (currentURL.contains("citibankonline.com/")) {

			System.out.println("pass");
		}
		driver.close();

		// Switch back to parent window
		// driver.switchTo().window(windowlist.get(0)); // works
		// driver.switchTo().defaultContent();
		driver.switchTo().window(parentId);
		System.out.println("url" + driver.getCurrentUrl());

	}

}
