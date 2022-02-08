import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		// launch browser
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		// Go to sigin in 
		WebElement signin = driver.findElement(By.className("nav-line-1-container"));
		// go to option
		WebElement link = driver.findElement(By.xpath("//span[text()='Your Orders']"));
		//a.moveToElement(signin).moveToElement(link).perform();
		
		//Right click on link
		a.moveToElement(signin).moveToElement(link).contextClick(link).perform();
		
		WebElement text = driver.findElement(By.id("nav-flyout-ya-newCust"));
		a.moveToElement(signin).moveToElement(text).doubleClick().perform();
		
		
		
		
		
	}

}
