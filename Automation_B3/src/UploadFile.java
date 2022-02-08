import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		//create a object for driver and Launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "file:///home/yunusshaik/Desktop/QA_B3/SamplePage.html";
		driver.get(baseURL);
		
		WebElement uploadBtn = driver.findElement(By.id("myFile"));
		Thread.sleep(5000);
		
		uploadBtn.sendKeys("/home/yunusshaik/Desktop/QA_B3/SamplePage.html");
	}

}
