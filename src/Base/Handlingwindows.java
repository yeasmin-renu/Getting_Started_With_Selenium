package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		//these frame portion is unavailable at the website	
		
		WebElement iframe2 = driver.findElement(By.id("iframe2"));     //locates the frame 
		driver.switchTo().frame(iframe2);   //switches focus to the frame to perform operation
		
		driver.findElement(By.id("q")).sendKeys("hello");  //locates desired element on the frame and perform operation 
		
		driver.switchTo().defaultContent();    //switches focus back on the main window 
		driver.findElement(By.id("ta1")).sendKeys("Hello I am here");   //locate element on the main window and perform operation 
		
			
		
		driver.quit();
		
		
		
	}

}
