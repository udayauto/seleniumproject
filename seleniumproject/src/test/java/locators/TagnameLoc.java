package locators;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLoc {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.google.com/");
		  // tagname locator
		  List<WebElement> links = driver.findElements(By.tagName("a")); // 71 links
		  int linksCnt =  links.size();
		  System.out.println(linksCnt);
		  
		  // 25 --- 0 to 24 
		  
		  for (int i = 0; i < linksCnt; i++) {
			  
			  if (!(links.get(i).getText().isEmpty())) {
			
			  String linkName = links.get(i).getText();
			
			 // String linkClass = links.get(i).getAttribute("class");
			  String linkUrl = links.get(i).getAttribute("href");
			  String linkTagname = links.get(i).getTagName();
			  
			  System.out.println("link Name is-- " + i +": " + linkName);
			//  System.out.println("link is-- " + i +": " + linkUrl);
			 // System.out.println("link tagname is-- " + i +": " + linkTagname);
			  }
			  }

	}

}
