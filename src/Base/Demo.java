package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
//accessing website	
		
		driver.get("http://omayo.blogspot.com/");
	
//(manage) maximizing window size
		
		driver.manage().window().maximize();
		
//finding UI element
		
	  // WebElement element = driver.findElement(By.id("confirm"));
		
//clicking on Confirm button	
		//element.click();   
		
		//WebElement element1 = driver.findElement(By.name("q"));
		
//sendKeys- types inside search box		
		//element1.sendKeys("Arun Moototi");
		
		//WebElement element = driver.findElement(By.id("textbox1"));
		
//holding program execution for 5 seconds
		//Thread.sleep(5000);
		
//clears text from textBox	
			//element.clear();
		
//locating using class
		
		/*WebElement element = driver.findElement(By.className("classone"));
		Thread.sleep(5000);
		
		element.sendKeys("ClassOne");*/
		
//locating using LinkText
		
		/*WebElement element = driver.findElement(By.linkText("compendiumdev"));
		
		element.click();*/
		
//locating using PartialLinkText
		
			/*	WebElement element = driver.findElement(By.partialLinkText("compendium"));
				Thread.sleep(3000);
				element.click();		*/
				
				
//locating using Xpath
				
		/*		WebElement element = driver.findElement(By.xpath("//input[@id='confirm']"));
				Thread.sleep(3000);
				element.click();	*/
		
//locating using id, className
		
		String text = driver.findElement(By.id("pah")).getText();		
		System.out.println(text);
		
		String txt = driver.findElement(By.className("gsc-search-button")).getText();
		System.out.println(txt);
	}

}
