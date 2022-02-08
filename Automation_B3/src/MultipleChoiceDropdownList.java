import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleChoiceDropdownList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']"));
		Select s = new Select(dropdown);
	
		
		if (s.isMultiple()) {
			System.out.println("It will allow multiple selection");
			
		} else {
			System.out.println("It will not allow multiple selection");

		}
		
		s.selectByVisibleText("February");
		s.selectByIndex(6);
		s.selectByValue("Ap");
		
		//s.deselectAll();
		s.deselectByIndex(6);
		s.deselectByValue("Feb");
		s.deselectByVisibleText("April");
		
	}
	

}
