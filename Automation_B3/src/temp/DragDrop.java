package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		String baseURL = "https://demoqa.com/droppable";
		driver.get(baseURL);

		WebElement src = driver.findElement(By.id("draggable"));
		WebElement tgt = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(src, tgt).perform();
	
	}

}