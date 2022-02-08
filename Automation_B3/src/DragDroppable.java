import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDroppable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable");
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement tgt = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(src, tgt).perform();
	}

}
