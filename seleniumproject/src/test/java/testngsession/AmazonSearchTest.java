package testngsession;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class AmazonSearchTest extends BaseClassTest {
	
	@Test
	public void verifyAmazonSearchTest() {
		
		//open browser --chrome/ firefox
 
		startBrowser("firefox");
		driver.get("https://amazon.com/");
		waitForElementPresent(10);
		switchToFrame(1);
		
	
	}
	


}
