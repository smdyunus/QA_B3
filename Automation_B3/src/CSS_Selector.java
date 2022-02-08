import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.className("nav-line-1-container")).click();

		//Css selector by id
		WebElement email = driver.findElement(By.cssSelector("input[id='ap_email']"));
		email.sendKeys("9620301980");
		Thread.sleep(4000);
		email.clear();
		Thread.sleep(4000);
		//Css selector by Attribute
		WebElement email1 = driver.findElement(By.cssSelector("input[type='email']"));
		email1.sendKeys("9620301980");
		//Css selector by class
		driver.findElement(By.cssSelector("input[class='a-button-input']")).click();
		
		// input[id='ap_email'] written as input#ap_email
		// input[class='a-button-input']  written as input.a-button-input
		// # is Id
		// . class
		
		//Css selector by Combining attributes 
		driver.findElement(By.cssSelector("input[id='ap_password'][name='password']")).sendKeys("Yunus@5818");

		//Css selector by start-with
		//driver.findElement(By.cssSelector("input[id^='sign']")).click();
		
		//css selector by End-with
		//driver.findElement(By.cssSelector("input[id$='mit']")).click();
		
		//css selector by contains
		driver.findElement(By.cssSelector("input[id*='Sub']")).click();
		
	}

}
