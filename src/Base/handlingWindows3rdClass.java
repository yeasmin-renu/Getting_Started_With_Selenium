package Base;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindows3rdClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
//handling windows 
		
//multiple windows		
		
		driver.findElement(By.linkText("Open a popup window")).click();	 //first child window
		
		driver.findElement(By.linkText("Blogger")).click();   //second child window 
			
		Set<String> windowsID = driver.getWindowHandles();
			
		Iterator<String> itr = windowsID.iterator();    //using iterator to iterate between windows 
		
		String paraText = null;  //declaring global variable
	
		while (itr.hasNext()) {
			
			String windowid = itr.next();
			driver.switchTo().window(windowid);

//matches with the page title			
			
			if(driver.getTitle().equals("Basic Web Page Title")) {
				
			paraText =	driver.findElement(By.id("para1")).getText();
				
				
			}		
			
		}
		
		System.out.println(paraText);
		
		driver.quit();
		
		
		
		
		
		
	
		
		
		
		
/*	/////  handling two windows /////
 * 

        String mainWindow = itr.next();             //returns next element (window ID), if there is another window after main window
		
		String popUpWindow = itr.next();
		
		driver.switchTo().window(popUpWindow);    //switches to popUp window to focus on that window. and perform operation
		
		
		String txtonPopUpWindow = driver.findElement(By.id("para1")).getText();   //now this will retrieve the text
		System.out.println(txtonPopUpWindow);
		
		driver.close();    //only closes the popup window, since its in focus 
		
		Thread.sleep(2000);
		
		driver.switchTo().window(mainWindow);
		
		Thread.sleep(2000);
		
		driver.close();    //now it will close the main window 
		
*/		
		
		
		
//while loop to extract windows ID 	
		
	/*	while(itr.hasNext()) {
			
			String windowID = itr.next();
			System.out.println(windowID);
			
		} */
		
		//Thread.sleep(2000);
		
		//driver.quit();
		
		
		
	}

}

