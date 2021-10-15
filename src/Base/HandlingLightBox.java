package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingLightBox {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/lightbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//no need to switch focus on lightbox, because its the same thing
		
		driver.findElement(By.id("lightbox1")).click();  //clicks on the light box
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@class='close cursor']")).click();  //click on the close button of the light box using xpath
		
		//driver.findElement(By.cssSelector("[class='close cursor']")).click();  //using cssSelector
		
		driver.findElement(By.cssSelector(".closecursor")).click();  //using cssSelector class shortcut

		
		driver.quit();
		
		
	}

}
