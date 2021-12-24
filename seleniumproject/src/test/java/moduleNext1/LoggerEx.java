package moduleNext1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoggerEx {
	
	@Test
public void testCase() {
		
Logger logger = LogManager.getLogger("devpinoyLogger");
		
		logger.debug("Test script execution started");
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		logger.debug("Firefox browser got launched");
	
		driver.manage().window().maximize();
		logger.debug("Browser got maximized");
		
		driver.get("http://www.omayo.blogspot.com");
		logger.debug("Omayo application is opened");
		
		driver.findElement(ById.linkText("compendiumdev")).click();
		logger.debug("Clicked on link and navigated to compendiumdev site");
		
		driver.navigate().back();
		logger.debug("Navigated back to omayo application");
		
		driver.navigate().forward();
		logger.debug("Navigated forward to compendium site");
		
		driver.close();
		logger.debug("Browser got closed");
		
		
		
	}

}
