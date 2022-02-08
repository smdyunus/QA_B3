package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preceding {

public static void main(String[] args) {
		
		WebDriver driver;
		WebElement w;
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		 driver= new ChromeDriver();
 		 
         // Launch the application
     	 driver.get("https://www.guru99.com/");
     	 
     	 //Search the element by using preceding method
     	 w=driver.findElement(By.xpath("//*[@type='submit']//preceding::input"));
      	
		//Print the searched element
     	 System.out.println(w.getText());
	 
	//Close the browser
     driver.quit();

	}

}

