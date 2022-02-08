import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromXLS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//File Location
		File file = new File("input/TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = wb.getSheet("Employees");
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell0 = row1.getCell(0);
		XSSFCell cell1 = row1.getCell(1);		
		
		DataFormatter formatter = new DataFormatter();
		String mobile = formatter.formatCellValue(cell0);
		String pwd = formatter.formatCellValue(cell1);
		
		System.out.println(mobile);
		System.out.println(pwd);
		
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
			//create a object for driver and Launch browser
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		 
			driver.get("https://www.amazon.in/");
			//Click on Sigin link
			driver.findElement(By.className("nav-line-1-container")).click();
			//Enter Mobile number in mobile number field
			driver.findElement(By.id("ap_email")).sendKeys(mobile);
			//Click on Continue button
			driver.findElement(By.id("continue")).click();
			//Enter Password
			driver.findElement(By.id("ap_password")).sendKeys(pwd);
			//Click on Signin button
			driver.findElement(By.id("signInSubmit")).click();	
	}

}
