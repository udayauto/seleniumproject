package excel.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearch {
	
	@Test
	public void verifyAmazonSearch() throws Exception {
	
		//1. Open Amazon application. 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open amazon web site
		driver.get("https://www.amazon.com/");
		
		//Read data from Excel ---
	
		String path = "C:\\Users\\udayk\\Downloads\\seleniumproject\\seleniumproject\\src\\test\\resources\\testdata.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		//Save the Excel into Workbook - API
		Workbook wb = WorkbookFactory.create(file);
		Sheet brandsSheet = wb.getSheet("brands");
		
		//finding total values form particular sheet
		int count = brandsSheet.getLastRowNum();
		
		
		//read multiple values --
		
		for (int i = 1; i <= count; i++) {
			
			//read a value from Excel.
			String searchTerm = brandsSheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(searchTerm);
			
			//2. Search for diffnt search terms.	
			WebElement amazonSearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			amazonSearchBox.clear();
			amazonSearchBox.sendKeys(searchTerm);
			amazonSearchBox.submit();
			
		}
		
		//verify
		String expectedSearchText="RESULTS";
		String actualResultsText = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-normal'][normalize-space()='RESULTS']")).getText();
		
		//verify
		Assert.assertEquals(expectedSearchText, actualResultsText);
		
		
	}
	

}
