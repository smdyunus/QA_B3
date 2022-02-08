import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("file:///home/yunusshaik/Desktop/QA_B3/xpath.html");
		
		//Absolute xpath
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Yunus");
		
		//Relative xpath
		driver.findElement(By.xpath("//input[3]")).sendKeys("Yunus");
		driver.findElement(By.xpath("//input[4]")).sendKeys("Yunus");

		
	}

}
