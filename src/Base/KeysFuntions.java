package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFuntions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://omayo.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	 

/*	  
 * ANOTHER METHOD: USING WEBELEMENT SENDKEYS()
 *   
	    driver.findElement(By.id("input-email")).sendKeys("arun.selenium@gmail.com"); 
	    driver.findElement(By.id("input-password")).sendKeys("Second@123");
	    
	    driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
	    
*/
	      
	    
/*  using actions class  
 * 
 *  
	 	Actions a = new Actions(driver);
	    
	    driver.findElement(By.name("userid")).sendKeys("Arun"); 
	    
	    a.sendKeys(Keys.TAB).perform();
	    
	    driver.findElement(By.name("pswrd")).sendKeys("12345"); 
	    
	    a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();  */
	    
	    
	    
	    
	    driver.findElement(By.id("ta1")).sendKeys("Arun Mootori fucking up my mind"); 
	    driver.findElement(By.id("ta1")).sendKeys(Keys.chord(Keys.CONTROL, "Z"));
	    
	    driver.quit(); 
	
		

	}

	
}

