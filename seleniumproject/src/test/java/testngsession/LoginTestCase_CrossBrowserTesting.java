package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase_CrossBrowserTesting extends BaseClassTest {
	
	// inheritance	
	// one more

	@Parameters({"browser", "userName", "password"})
	@Test
	public void verifyLoginTestCase(String browser, String userName, String password) {
		
		//open browser 
		startBrowser(browser);
		
		//open application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		//perform login (input username and Pwd) then submit
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		
		// click on login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

}
