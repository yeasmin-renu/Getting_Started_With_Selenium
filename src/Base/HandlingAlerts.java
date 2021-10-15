package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.id("alert1")).click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();  //switches to alert window 
		String textFromAlert = alert.getText();
		
		System.out.println(textFromAlert);
		
		alert.accept();  //clicks on OK button of alerts
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}

