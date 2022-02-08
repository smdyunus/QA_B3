import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Create a new account
		//DOB
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day); 
		s.selectByIndex(15);
		
		if (s.isMultiple()) {
			System.out.println("It will allow multiple selection");
			
		} else {
			System.out.println("It will not allow multiple selection");

		}
			
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month); 
		s2.selectByValue("4");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s1 = new Select(year); 
		s1.selectByVisibleText("1990");
		
		
	}

}
