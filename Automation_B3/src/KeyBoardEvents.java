import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/text-box");
	
		//Name
		WebElement name = driver.findElement(By.id("userName"));
		name.sendKeys("Yunus");
		//EMail
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("yunus.sqa@gmail.com");
		//Current Add
		WebElement cadd = driver.findElement(By.id("currentAddress"));
		cadd.sendKeys("IND 560076");
		
		//Perminant Add
		WebElement padd = driver.findElement(By.id("permanentAddress"));
	
		//Copy Current Address to Perminant Address
			
		Actions a = new Actions(driver);
		a.moveToElement(cadd)
		.click()
		.keyDown(Keys.CONTROL)
		.sendKeys("A")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		a.keyDown(Keys.CONTROL)
		.sendKeys("C")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
		a.sendKeys(Keys.TAB)
		.build().perform();

		a.keyDown(Keys.CONTROL)
		.sendKeys("V")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
	}
	
}
