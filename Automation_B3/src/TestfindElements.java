import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestfindElements {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		//create a object for driver and Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		String url = "https://www.amazon.in/"; 
		driver.get(url);
		WebElement Mobiles = driver.findElement(By.linkText("Mobiles"));
		Mobiles.click();
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for (WebElement l : list) {
			System.out.println(l);
		}
		
		driver.close();  // it will close current active browser
		//driver.quit();   // it will all the browsers
		
	}

}
