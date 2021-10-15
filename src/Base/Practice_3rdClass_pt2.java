package Base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_3rdClass_pt2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/"); 
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alert1")).click(); 
		
		Alert alert = driver.switchTo().alert();
		
		String alertTxt = alert.getText();
		
		System.out.println(alertTxt);
		
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}

}

