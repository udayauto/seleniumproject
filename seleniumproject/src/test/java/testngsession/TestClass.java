package testngsession;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass extends BaseClassTest {

	@Parameters("browser")
	@Test
	public void test(String browser) {
		startBrowser(browser);
		driver.get("https://www.amazon.com/");
	
	}

}
