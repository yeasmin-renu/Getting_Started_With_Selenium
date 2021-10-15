package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingdropDowns {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		WebElement dropDown = driver.findElement(By.id("drop1"));
		WebElement multiSelection = driver.findElement(By.id("multiselect1"));
		
		
		Select select = new Select (multiSelection);  //select predefined class in selenium
				
	//	select.selectByIndex(3);  //selecting by index no.
		
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Swift");
		
		Thread.sleep(2000);
		
		select.deselectByVisibleText("Swift");  //deselect from multiselection boxes only

		
		Thread.sleep(2000);
		
		
		
		
		
		driver.quit();
		
		
		
	}

}

