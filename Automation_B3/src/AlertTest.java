import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		WebElement tryBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		Thread.sleep(5000);
		//al.sendKeys("test this alert");
		
		al.accept(); // click on OK button
		//al.dismiss();  // click on cancel button
		
		Thread.sleep(5000);

		tryBtn.click();
		Alert al1 = driver.switchTo().alert();
		Thread.sleep(5000);

		al1.dismiss();

		
	}

}
