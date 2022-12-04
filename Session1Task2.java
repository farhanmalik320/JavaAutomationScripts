package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Session1Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cva\\Downloads\\ChromeDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
    	
        String baseUrl = "https://staging.gamesfi.live/";
        driver.get(baseUrl);
        
        //click on  contact us
        driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).click();
        
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        driver.findElement(By.name("name")).sendKeys("testuser");
        driver.findElement(By.name("email")).sendKeys("test@yopmail.com");
        driver.findElement(By.name("message")).sendKeys("Testing");
        
        //WebElement element = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h5")));

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Submit')]")));
        
        //driver.findElement(By.name("message")).sendKeys(Keys.RETURN);
         driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
         
         String successmsg = driver.findElement(By.className("lgBzFH")).getText();
         System.out.println(successmsg);
         
         String expectedmsg= "You have successfully submitted the form and our team will get back to you within 24 hours.";
         if (successmsg.contentEquals(expectedmsg))
         {
        	 System.out.println("Form submitted successfully");
        	 driver.quit();
         }
         else
         {
        	 System.out.println("Error message");
         }
        
	}

}
