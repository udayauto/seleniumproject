package window;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import inheritanceex.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleEx extends BaseTest {
	WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.officedepot.com/");
		driver.findElement(By.linkText("Credit Cards")).click();
		driver.findElement(By.xpath(
				"//a[@href='https://www.officedepot.com/business-credit-account-apply?cm_sp=credit_promotions-_-BUSINESS-ACCOUNT_apply-now_-_-&promo_name=credit_promotions&promo_id=credit_promotions-BUSINESS-ACCOUNT-apply-now&promo_creative=BUSINESS-ACCOUNT_apply-now'][normalize-space()='Apply Now']"))
				.click();
		System.out.println(driver.getCurrentUrl());
		// window handling

		String parentWindow = driver.getWindowHandle();
		//System.out.println("parent winodw id: " + parentWindow);
		// driver.switchTo().window(parentWindow);
		// driver.findElement(By.xpath("//div[@class='od-col
		// od-col-gutter']//a[@class='od-menu-link'][normalize-space()='Associate
		// Discount']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		// System.out.println("windows id: " + windows);
		System.out.println("windows count" + windows.size());

		for (String child : windows) {
			System.out.println("window: " + i + ": " + child);

			if (i == 1) {
				driver.switchTo().window(child);
			//	break;
			}

			i++;
		}
		String currentURL = driver.getCurrentUrl();
		System.out.println("current URL" + currentURL);
		if (currentURL.contains("https://citiretailservices.citibankonline.com/")) {
			
			System.out.println("Pass: citibank url is availavle");
			
		}else {
			System.out.println("Fail: citibank url is NOT availavle ");
		}

		driver.close();
		driver.switchTo().defaultContent();
		
	}

}
