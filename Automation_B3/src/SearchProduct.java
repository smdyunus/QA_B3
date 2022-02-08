import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//click on search bar
		WebElement bar = driver.findElement(By.id("twotabsearchtextbox"));
		bar.sendKeys("iphone 13");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Enter some text iphone
		//clck in search icon
		//select product and navigate to price
		//print the price
		
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro (256GB) - Sierra Blue']/../../../../div[3]//span[@class='a-price-whole']"));
		System.out.println(price.getText());
		//span[text()='Apple iPhone 13 Pro (256GB) - Sierra Blue']/../../../../div[3]//span[@class='a-offscreen']
	}
	

}
