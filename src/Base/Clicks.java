package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://omayo.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    
	   WebElement SearchBox = driver.findElement(By.name("q")); 
	   
	   SearchBox.sendKeys("Renu");
	    
	   Actions a = new Actions( driver);
	   
	   Thread.sleep(2000);
	    
	 //  a.contextClick(SearchBox).perform();  //rightClick
	   
	   a.doubleClick(SearchBox).perform();  //double click
	   
	   driver.quit();
		
	}

}

