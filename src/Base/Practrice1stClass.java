package Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Practrice1stClass {

	public static void main(String[] args) throws InterruptedException {
		
		String browser = "Chrome";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
			
			driver = new ChromeDriver(); 
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/geckodriver");
			
			driver = new FirefoxDriver(); 
			
		} else if (browser.equalsIgnoreCase("Safari")) {
			
			driver = new SafariDriver(); 
		}
		
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		/*String title=driver.getTitle();
		System.out.println(title);
	
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);*/
		
		/*driver.navigate().to("https://www.apple.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		Thread.sleep(3000);*/
		
		/*String source= driver.getPageSource();
		System.out.println(source);*/
		
	/*	driver.findElement(By.id("email")).sendKeys("renu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234567");
		driver.findElement(By.name("login")).submit();
		
		Thread.sleep(2000); */
		
	/*	List<WebElement> elements = driver.findElements(By.tagName("a"));	
		
		for (int i=0;i<elements.size();i++) {
			
			System.out.println(elements);
		}
		*/
		
		driver.quit();
	
	
		
		
		
	}

}

