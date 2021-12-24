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
		String expGoogleTitle = obj.readProperty("expectedGoogleTitle");

		//open browser
		startBrowser(browser);
		driver.get(url);
		
		//verify title
		String actualTitle = driver.getTitle();
	 
		//verifications
		Assert.assertEquals(expGoogleTitle, actualTitle);
		
		
	}

}
