package excel.reader;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadData {

	@Test
	public void readDataFile() throws Exception {
	
		// File hadling --open the File in read mode
		FileInputStream file = new FileInputStream(
				"C:\\workspace\\seleniumproject\\src\\test\\resources\\testdata.xlsx");
		 
		//latest api
		Workbook wb = WorkbookFactory.create(file);
		Sheet stageDataSheet = wb.getSheet("loginTestData");
		
		// read the data from sheet --usName and pwd
		String userName = stageDataSheet.getRow(1).getCell(0).getStringCellValue();
		String password = stageDataSheet.getRow(1).getCell(1).getStringCellValue();

		System.out.println("user Name"  + userName);
		System.out.println("password" + password);

		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//input userName
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

	}

}
