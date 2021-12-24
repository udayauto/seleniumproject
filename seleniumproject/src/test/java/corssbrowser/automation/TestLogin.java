package corssbrowser.automation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLogin extends BaseClass{
	
	@Parameters("browser")
	@Test
	public void loginFunctionality(String browser) {

		// open browser
		startBrowser(browser);

		// open application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// lOgin
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		String expectedDashboardText = "Dashboard";
		String actualDashboardText = driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]")).getText();
		

		if (expectedDashboardText.equalsIgnoreCase(actualDashboardText)) {
			System.out.println("Login is successful");
			
		}else {
			System.out.println("login is not successful");
		}
	}

	

}
