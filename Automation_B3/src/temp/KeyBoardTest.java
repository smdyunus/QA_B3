package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		//find the element of name
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Yunus");
		
		//find the element of email
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("test@12345.com");

		//find the element of current address
		WebElement currentAdd = driver.findElement(By.id("currentAddress"));
		currentAdd.sendKeys("IND 560098");
		
		//find the element of perminant address
		WebElement perminantAdd = driver.findElement(By.id("permanentAddress"));

		/*
		//copy current address
		currentAdd.sendKeys(Keys.CONTROL);
		currentAdd.sendKeys("A");
		currentAdd.sendKeys(Keys.CONTROL);
		currentAdd.sendKeys("C");
		//Press the Tab key to move focus to perminant address field
		currentAdd.sendKeys(Keys.TAB);

		//Paste the address in Perminent add field
		perminantAdd.sendKeys(Keys.CONTROL);
		perminantAdd.sendKeys("V");
	*/
		
		Actions a = new Actions(driver);
		
		a.moveToElement(currentAdd)
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
		
		String currentAdd1 = "IND 560098";
		String permAdd1="";
		permAdd1 = perminantAdd.getText();

		Thread.sleep(3000);
		System.out.println(permAdd1);
			
		if(currentAdd1.contentEquals(permAdd1))
			System.out.println("Test Pass");
		else {
			System.out.println("Test Failed");
		}
		
		
	}

}