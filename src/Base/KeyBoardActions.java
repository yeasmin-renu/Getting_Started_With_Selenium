package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://omayo.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    
	   WebElement CompendiumDev = driver.findElement(By.linkText("compendiumdev"));
	   
	   Actions a = new Actions(driver);
	   
	   a.keyDown(Keys.COMMAND).click(CompendiumDev).keyUp(Keys.COMMAND).build().perform();
	    
	    Thread.sleep(2000);
	    
	    driver.quit();

	}

}

