package utility;
import org.testng.Assert;
import org.testng.annotations.Test;
import testngsession.BaseClassTest;
public class GoogleSearchFunction extends BaseClassTest{
	
	@Test
	public void verifyGoogleSearchFunction() throws Exception {
		
		PropertyReader obj = new PropertyReader();
		
		String browser = obj.readProperty("browser");
		String url = obj.readProperty("url");

		//open browser
		startBrowser(browser);
		driver.get(url);
		
		
		
		
	}

}
