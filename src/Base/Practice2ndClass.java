package Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Practice2ndClass {

	public static void main(String[] args) throws InterruptedException {
		
	  String browser = "Chrome";
	  WebDriver driver = null;
	  
	  if(browser.equalsIgnoreCase("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		  driver = new ChromeDriver(); 
		  
	  } else if(browser.equalsIgnoreCase("Firefox")) {
		  
		  System.setProperty("webdriver.gecko.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/geckodriver");
		  driver = new FirefoxDriver(); 
		  
	  } else if(browser.equalsIgnoreCase("safari")) {
		  
		  driver = new SafariDriver(); 
		  
	  }
	  
	  driver.get("http://omayo.blogspot.com/");
	  driver.manage().window().maximize(); 
	  
//getting title of the page	  
	  
	/*  String title=  driver.getTitle();
	  System.out.println(title); */
	  
//getting the current url of the site	  
	  
	/*  String url = driver.getCurrentUrl();
	  System.out.println(url);  */
	  
// getting attribute name
	  
 /*    String attribute =  driver.findElement(By.cssSelector("button[type='submit']")).getAttribute("class");
	  System.out.println("Name of the attribute is: "+attribute);  */
	  
//locating visible button
	  
	/*  boolean btn = driver.findElement(By.id("but2")).isDisplayed();
	  System.out.println(btn);  */
	
	  
//checking if the button is enabled or not 
	  
	/*  boolean btn = driver.findElement(By.id("but2")).isEnabled();
	  System.out.println(btn);
	  
	  boolean btn1 = driver.findElement(By.id("but1")).isEnabled();
	  System.out.println(btn1);  */

//checking if checkbox and radio button is selected	 
	  
/*	  boolean b = driver.findElement(By.id("checkbox1")).isSelected();
	  System.out.println("is the check box selecetd? true or false : "+b);
	  
	  boolean b1 = driver.findElement(By.id("checkbox2")).isSelected();
	  System.out.println("is the check box selecetd? true of false : "+b1);
	  
	  boolean b2 = driver.findElement(By.id("radio1")).isSelected();
	  System.out.println("Is the radio button checked? true or false: "+b2);
	  
	  boolean b3 = driver.findElement(By.id("radio2")).isSelected();
	  System.out.println("Is the radio button checked? true or false: "+b3);  */
	  
//navigating back and forward	
	  
/*	  driver.navigate().to("https://www.aiub.edu/");
	  Thread.sleep(2000); 
	  
	  driver.navigate().back();
	  Thread.sleep(2000); 
	  
	  driver.navigate().refresh();
	  Thread.sleep(2000); 
	  
	  driver.navigate().forward();
	 
	  String pageSource = driver.getPageSource();
	  System.out.println(pageSource);  */
	  
//submitting form
	  
	/*  driver.findElement(By.id("username")).sendKeys("17-34551-2");
	  driver.findElement(By.id("password")).sendKeys("12345678");
	  driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).submit(); */
	  
//retrieving tag name 
	  
	/*  String tag = driver.findElement(By.tagName("input")).getTagName();
	  System.out.println(tag); */
	  
	  
//retrieving cssValue, size and location 
	  
/*	  String cssValue= driver.findElement(By.id("home")).getCssValue("line-height");
	  System.out.println(cssValue);
	  
	  Dimension size= driver.findElement(By.id("home")).getSize();
	  System.out.println(size);
	  
	  Point  location= driver.findElement(By.id("home")).getLocation();
	  System.out.println(location);  */
	  

//retrieving multiple elements with same tag	  
	  
	  List<WebElement> element = driver.findElements(By.tagName("a"));
	  
	  for (int i=0; i<element.size();i++) {
		  
		  if(element.get(i).getText().length()>0)
		  
		  System.out.println("element with tag a :"+element.get(i).getText());
		  
	  }
	  
	  for (WebElement j : element) {
		  
		  if (j.getText().length()>0)
		  
		  System.out.println(j.getText());
	  }
			  
	  
	  
	  Thread.sleep(3000); 
	   
	   driver.quit();
	  
	  
	  
		
	}

}

