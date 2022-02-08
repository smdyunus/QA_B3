import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfxpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.className("nav-line-1-container")).click();
		
		//Relative xpath
		//WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		//email.sendKeys("9620301980");
		
		//Absolute xpath
		//WebElement email = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div/div/div/div/input[1]"));
		//email.sendKeys("9620301980");
		
		//xpath by text() function : 
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	
		//xpath by contains() function with text: 
		//driver.findElement(By.xpath("//span[contains(text(),'Need')]")).click();

		//xpath by contains() function with class: 
		//span[contains(@class,'expa')]
		
		//Backward Traversing 
		//driver.findElement(By.xpath("//input[contains(@id,'ap_email')]/../label"));

		//Farward Traversing 
		//driver.findElement(By.xpath("//label[contains(text(),'Email')]/../input[1]")).sendKeys("9786754");

		WebElement bar = driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]"));
		bar.sendKeys("iphone 12 pro");
		
		driver.findElement(By.id("nav-search-submit-text")).click();
		Thread.sleep(3000);
		WebElement price = 
				driver.findElement
				(By.xpath("//span[text()='New Apple iPhone 12 Pro (256GB) - Graphite with Apple AirPods Pro']/../../../../..//span[@class='a-price']"));
		System.out.println(price.getText());
		
		
		//Following sibling
		//WebElement btn = driver.findElement(By.xpath("//input[contains(@id,'ap_email')]/following::span"));
		//Thread.sleep(3000);
		//btn.click();	
		
		//WebElement email = driver.findElement(By.xpath("//input[contains(@id,'continue')]/preceding::span"));

	}

}
