package Base;

	import java.time.Duration;
	import java.util.NoSuchElementException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.google.common.base.Function;


	public class WaitingMechanism3rdClass {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "/Users/yeasminara/Documents/Eclipse Workplace/DemoProject/drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("http://omayo.blogspot.com/");
			driver.manage().window().maximize();
		
	//Selenium Implicit wait - global wait	
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//0 seconds, action taken immediately 
			driver.findElement(By.className("dropbtn")).click(); 
			
		//3 seconds, after 3 seconds action taken 
		  //	driver.findElement(By.linkText("Facebook")).click();
			
			
			
	//Explicit wait - individual wait
			
		/*	WebDriverWait wait = new WebDriverWait(driver, 30);
		    WebElement facebookElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
			
			facebookElement.click(); */
		

	//FluentWait
			
			//Waiting 30 seconds for an element to be present on the page, checking
			   // for its presence once every 5 seconds.
			
			   Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);

			   WebElement facebookElement = wait1.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.linkText("Facebook"));
			     }
			   });
			
			   facebookElement.click();
			
			driver.quit();
		
		
			
		/*	 using Thread.Sleep 
		 * 
		 * driver.findElement(By.className("dropbtn")).click();  //dropdown will appear after 3 seconds 
			
			Thread.sleep(3000);   //it will wait for 3 sec. this is JAVA mechanism
			
			driver.findElement(By.linkText("Facebook")).click();    //then it will click on facebook
			
			
		*/
			
			
			
			

		}

	}

	


