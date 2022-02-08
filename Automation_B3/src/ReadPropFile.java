import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {

		// File Location
		 File file = new File("Config/dataFile.properties");
		 FileInputStream fileInput = null;
		
		 //check the file
		 try {
				fileInput = new FileInputStream(file);

		//Throw the error
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Properties p  = new Properties(); 
		//Load the prop from file 
		 try {
			 p.load(fileInput);
			
		} 
		catch (Exception e) {
			e.printStackTrace();		
		}
		 
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
			//create a object for driver and Launch browser
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		 
			driver.get(p.getProperty("URL"));
			driver.findElement(By.className("nav-line-1-container")).click();
			driver.findElement(By.id("ap_email")).sendKeys(p.getProperty("username"));
			//Click on Continue button
			driver.findElement(By.id("continue")).click();
			//Enter Password
			driver.findElement(By.id("ap_password")).sendKeys(p.getProperty("password"));
			//Click on Signin button
			driver.findElement(By.id("signInSubmit")).click();
			}
}
