import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTagName {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		//create a object for driver and Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///home/yunusshaik/Desktop/QA_B3/SamplePage.html");
		driver.findElement(By.tagName("a")).click();
		
	}

}
