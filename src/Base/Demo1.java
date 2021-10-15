package Base;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //global wait. waits for every element. 
		
		
		driver.findElement(By.className("dropbtn")).click();  //takes 0 seconds 
		driver.findElement(By.linkText("Facebook")).click();  //tales 3 seconds, and action is taken immediately 
		
		WebDriverWait wait = new WebDriverWait(driver ,30); 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Facebook")));
		
		
		
		
		
		
		
		
		
		  driver.quit();
		  
		  
		  
		
		
	/*	driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();
		
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();
		
		String txt = null;
		
		
		while(itr.hasNext()) {
			
			String windowid = itr.next();
			driver.switchTo().window(windowid); 
			
			if (driver.getTitle().equals("Basic Web Page Title")) {
				
				txt = driver.findElement(By.id("para1")).getText();
			}
			
		}
		
		System.out.println(txt);   */
		
		
	 
		
		

	}

}

