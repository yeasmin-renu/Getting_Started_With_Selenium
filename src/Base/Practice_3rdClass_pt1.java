package Base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_3rdClass_pt1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/"); 
		driver.manage().window().maximize();
		
		
  /*  driver.findElement(By.linkText("Open a popup window")).click();
		
		
	  Set<String> windowIds = driver.getWindowHandles();
	   
	  Iterator<String> itr = windowIds.iterator();
	  
      String Mainwindow = itr.next();
      String popUp = itr.next();
      
      driver.switchTo().window(popUp);
      String txt = driver.findElement(By.id("para1")).getText();
	  System.out.println(txt);    */
	
		
		
		 driver.findElement(By.linkText("Open a popup window")).click();
		 driver.findElement(By.linkText("Blogger")).click();
		
		  Set<String> windowIds = driver.getWindowHandles();
		   
		  Iterator<String> itr = windowIds.iterator();
		  
		  String PARATXT = null;
		  
	      while (itr.hasNext()) {
	    	  
	    	  
	    	 String Windowids = itr.next();
	    	 driver.switchTo().window(Windowids);
	    	 
	    	 
	    	 if (driver.getTitle().equals("Basic Web Page Title")) {
	    		 
	    		 PARATXT = driver.findElement(By.id("para1")).getText();
	    	 }
	      }
		
	      System.out.println(PARATXT);
	      
		driver.quit();
		
		
		
	}

}
