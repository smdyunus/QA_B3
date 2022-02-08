import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

		public static void main(String[] args) throws InterruptedException 
		{	
		//set system properties
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		//create a object for driver and Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		//set system properties
		//System.setProperty("webdriver.geecko.driver", "/drivers/geeckodriver");	
		//FirefoxDriver driver1 = new FirefoxDriver();	
		//Enter the URL
		driver.get("https://www.amazon.in/");
		//Click on Sigin link
		driver.findElement(By.className("nav-line-1-container")).click();
		//Enter Mobile number in mobile number field
		driver.findElement(By.id("ap_email")).sendKeys("9620301980");
		//Click on Continue button
		driver.findElement(By.id("continue")).click();
		//Enter Password
		driver.findElement(By.id("ap_password")).sendKeys("Yunus@5818");
		//Click on Signin button
		driver.findElement(By.id("signInSubmit")).click();
		//Verify the page
		Thread.sleep(3000);
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
