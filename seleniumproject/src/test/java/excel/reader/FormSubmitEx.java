package excel.reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FormSubmitEx {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(dataProvider = "TestData")
	public void dataProvide(String fName, String lName, String address) {
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		driver.findElement(By.xpath("//input[@id='ts_first_name']")).sendKeys(fName);
		driver.findElement(By.xpath("//input[@id='ts_last_name']")).sendKeys(lName);
		driver.findElement(By.xpath("//textarea[@id='ts_address']")).sendKeys(address);

	}

	@DataProvider(name = "TestData")
	public String[][] search() throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\workspace\\seleniumproject\\src\\test\\resources\\testdata.xlsx");

		// read from excel --commands (POI)

		//XSSFWorkbook workbook = new XSSFWorkbook(file);
		Workbook wb = WorkbookFactory.create(file);
		 Sheet stageDataSheet = wb.getSheet("test");

		// get row count
		int rowCount = stageDataSheet.getLastRowNum()+1; //3
		int cellCount = stageDataSheet.getRow(0).getLastCellNum();
		String[][] testdata = new String[rowCount][cellCount];
		
		for (int row = 1; row <rowCount; row++) {

			for (int col = 0; col < cellCount; col++) {

				testdata[row][col] = stageDataSheet.getRow(row).getCell(col).toString();

			}

		}

		return testdata;
	}

}
