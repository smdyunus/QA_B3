package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		//create a object for driver and Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		WebElement signin = driver.findElement(By.className("nav-line-1-container"));
		WebElement link = driver.findElement(By.xpath("//*[text()='Manage Your Content and Devices']"));	
		
		//move from one element to other element
		a.moveToElement(signin).moveToElement(link).perform();
		
		//Right Click on 'Manage Your Content and Devices'
		a.moveToElement(signin).moveToElement(link).contextClick(link).perform();
		
		WebElement text = driver.findElement(By.id("nav-flyout-ya-newCust"));
		
		a.moveToElement(signin).moveToElement(link).doubleClick(text).perform();


	}
}