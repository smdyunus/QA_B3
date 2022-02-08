import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		//create a object for driver and Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.in/");
		
		driver.findElement(By.className("nav-line-1-container")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.close();
		
	}

}
