import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		//create a object for driver and Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "https://www.amazon.in/";
		driver.get(baseURL);

		File f1 = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("screenshots/1.LandingPage.png"));
		
		driver.findElement(By.className("nav-line-1-container")).click();
		File f2 = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f2, new File("screenshots/2.Login.png"));
		
		driver.findElement(By.id("ap_email")).sendKeys("9620301980");
		driver.findElement(By.id("continue")).click();
		File f3 = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f3, new File("screenshots/3.EnterPwd.png"));
		
		
		driver.findElement(By.id("ap_password")).sendKeys("Yunus@5818");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
		
		File f4 = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f4, new File("screenshots/4.HomePage.png"));
		
				System.out.println(driver.getTitle());
				String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
				String actualTitle="";
				actualTitle = driver.getTitle();
				if (actualTitle.contentEquals(expectedTitle)) {
					System.out.println("Test Pass");	
				} else {
					System.out.println("Test Fail");
				}
				driver.quit();
				}	
	}
	
