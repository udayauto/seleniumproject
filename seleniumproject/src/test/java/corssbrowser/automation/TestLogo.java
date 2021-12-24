package corssbrowser.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogo extends BaseClass {
	
	@Parameters("browser")
	@Test
	public void verifyLogo(String browser) {
		//start browser
		
		startBrowser(browser);
		
		//open application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//verify logo
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		if (logo.isDisplayed()) {
			System.out.println("logo is dispalyed");
		}else
		{
			System.out.println("logo is not dispalyed");
		}
		}
		
	}

