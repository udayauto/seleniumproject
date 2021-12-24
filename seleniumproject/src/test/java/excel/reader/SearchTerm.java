package excel.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTerm {

	@Test
	public void search() throws IOException, InterruptedException {
		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open amazon web site
		driver.get("https://www.amazon.com/");

		// read data from excel
		FileInputStream file = new FileInputStream(
				"C:\\workspace\\seleniumproject\\src\\test\\resources\\testdata.xlsx");

		// read from excel --commands (POI)
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet stageDataSheet = workbook.getSheet("brands");

		// get row count
		int rowCount = stageDataSheet.getLastRowNum(); // get count from excel
	
		for (int i = 1; i <= rowCount; i++) {
		// read data from cell
			String searchterm = stageDataSheet.getRow(i).getCell(0).getStringCellValue();

			// search in amazon
			WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			searchBox.clear();
			searchBox.sendKeys(searchterm);
			searchBox.submit(); // click

			Thread.sleep(5000);

		}

	}

}
