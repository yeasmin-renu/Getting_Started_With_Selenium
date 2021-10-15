package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://omayo.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    
	    WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
	    
	    Actions a = new Actions(driver); 
	    
	    a.moveToElement(blogsMenu).perform();
	    
	    WebElement selenium143 = driver.findElement(By.xpath("//span[contains(text(),'Selenium143')]")); 
	    
	    a.moveToElement(selenium143).click().build(). perform();
	    
	    driver.quit();

	}

}

