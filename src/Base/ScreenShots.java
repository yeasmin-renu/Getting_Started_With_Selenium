package Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShots {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.makemytrip.com/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
        Actions a = new Actions(driver);
        
        
        WebElement mmlogo = driver.findElement(By.xpath("//a[@data-cy='mmtLogo']"));
        
        Thread.sleep(3000);
        
        a.moveToElement(mmlogo).click().build().perform(); 
        
        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Del"); 
        
        
        
        for (int i=0;i<4;i++) {
        	
        	Thread.sleep(2000); 
            driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN); 

        	
        }
        
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER); 

        
        driver.quit();
        
        
		
			}
   
}
