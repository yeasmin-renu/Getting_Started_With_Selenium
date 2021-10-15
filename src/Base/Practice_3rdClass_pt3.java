package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_3rdClass_pt3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/"); 
		driver.manage().window().maximize();
		
		
		WebElement dropdown = driver.findElement(By.id("drop1")); 
		WebElement multiselection = driver.findElement(By.id("multiselect1"));
		
		// Select select = new Select (dropdown);
		
		Select select = new Select (multiselection);
		 
		// select.selectByIndex(2);
		// select.selectByVisibleText("doc 4");
		
		select.selectByIndex(2);
		select.selectByIndex(3);
		 
		 Thread.sleep(1000);
		 
		driver.quit();
	}

}
