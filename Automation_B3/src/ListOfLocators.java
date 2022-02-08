import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfLocators {
	
	public static void main(String[] args) throws InterruptedException 
	{	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	driver.get("https://www.amazon.in/");
	
	//Lauch the browser
	//Enter URL
	//Click on Sign in btn
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	//Enter Mobile number
	driver.findElement(By.name("email")).sendKeys("9620301980");
	//Click on Continue btn
	driver.findElement(By.className("a-button-input")).click();

	Thread.sleep(3000);
	driver.findElement(By.tagName("a")).click();
	
	//Thread.sleep(3000);
	//driver.findElement(By.linkText("Change")).click();
	
	//driver.findElement(By.name("email")).sendKeys("9620301980");
	//Click on Continue btn
	//driver.findElement(By.className("a-button-input")).click();
	
	//Thread.sleep(3000);
	//driver.findElement(By.partialLinkText("Chan")).click();
	//Enter Pwd
	//Click in Continue
	//Verify login status
	
	
	
	}
}
