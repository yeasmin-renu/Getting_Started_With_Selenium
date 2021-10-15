package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://omayo.blogspot.com/p/page3.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    
	    WebElement Pricemin = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']")); 
	    
	    Actions a = new Actions(driver); 
	    
	    a.dragAndDropBy(Pricemin, 100, 0).perform();
	    
	    Thread.sleep(2000);
	    
	    a.dragAndDropBy(Pricemin,-200, 0).perform();
	    
	   

	    Thread.sleep(2000);
	    
	    
	    driver.quit();

	}

}

