package temp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		String baseURL = "https://selenium08.blogspot.com/2019/11/dropdown.html";
		driver.get(baseURL);
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		//This will be applicable for all elements
		//10 sec; but element found in 1 sec --, it will not wait and move to other element, 9 sec saved
		//findElement, findElements

		// Thread.sleep(10000);
		//10 sec; but found in 1 sec --, still it will wait to complete time, 9 sec wasted
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='Month']"));
		Select s = new Select(dropdown);
	
		
		if(s.isMultiple()) {
			System.out.println("It will allow");
		}
		else {
			System.out.println("It will not allow");
		}
		s.selectByVisibleText("February");
		s.selectByIndex(6);
		s.selectByValue("Ap");
		
		//s.deselectByVisibleText("February");
		s.deselectByValue("Feb");
		System.out.println("Feb is deselected");
	}

}