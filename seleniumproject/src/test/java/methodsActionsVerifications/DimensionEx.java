package methodsActionsVerifications;
	import java.util.concurrent.TimeUnit;
	 
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
	 
	public class DimensionEx {
	 
	 public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	        driver.navigate().to("https://www.wikipedia.org/");
	        
	        System.out.println("Original Browser Window Dimension: "+driver.manage().window().getSize());
	        
	        //Create object of Dimensions class and setting the desired dimension
	        
	        Thread.sleep(3000);
	        Dimension d = new Dimension(768,800);
	        
	        //Resize the browser window to the given Dimension in the above line
	        
	        driver.manage().window().setSize(d);
	        
	        System.out.println("Current Browser Window Size is: "+driver.manage().window().getSize());
	     } 
	}
