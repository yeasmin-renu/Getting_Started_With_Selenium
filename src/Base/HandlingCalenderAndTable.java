package Base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderAndTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/GettingStartedwithSelenium/driver/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
		driver.findElement(By.id("travel_date")).click();
	
		Thread.sleep(2000);
		
	   while(!driver.findElement(By.className("datepicker-switch")).getText().contains("December")) {
		   
		   driver.findElement(By.className("next")).click(); 
		   
	   }
	   
	   List<WebElement> days = driver.findElements(By.className("day"));
	   
	   for (int i=0; i<days.size();i++) {
		   
		  if(days.get(i).getText().equalsIgnoreCase("15")) {
		   
		  days.get(i).click();
		  
		  break; 
		   }
		   
	   }  
		
		
		Thread.sleep(2000);
		
		
		driver.quit();

	}

}
