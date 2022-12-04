package AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Session3Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cva\\Downloads\\ChromeDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
    	
        String baseUrl = "https://rahulshettyacademy.com/AutomationPractice/"; 
        driver.get(baseUrl);
        
        //get the window handles
        String winHandlebefore = driver.getWindowHandle();
        
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(2000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='openwindow']")));
        //click on open window button
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        
        //switch to new widnow
        for(String winHandle : driver.getWindowHandles())
        {
            driver.switchTo().window(winHandle);
        }
        
        WebElement element2 = new WebDriverWait(driver, Duration.ofSeconds(2000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")));
        //click on the courses button
        driver.findElement(By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
        
        List<WebElement> course_name = driver.findElements(By.cssSelector(".courses-block .inner-box .lower-content h2 a"));
        System.out.println((course_name.size()));
        String course_name1= course_name.get(1).getText();
        System.out.println("The Course name is " + course_name1);
        
        String actualcoursename= course_name1;
        String expectedcoursename="Cypress-Modern Automation Testing from Scratch + Framework";
        if (actualcoursename.contentEquals(expectedcoursename))
        {
        	System.out.println("Course name matched and copied");
        	driver.close();
        }
        else
        {
        	System.out.println("Course name is different ");
        }
        
        //switch back to parent window
        driver.switchTo().window(winHandlebefore);
        
        //open new tab
        driver.switchTo().newWindow(WindowType.TAB);

        //open new web in new tab
        String tab2 = "https://courses.rahulshettyacademy.com/courses";
        driver.get(tab2);

        WebElement search_box = driver.findElement(By.id("search-courses"));
        search_box.sendKeys(course_name1);

        driver.findElement(By.id("search-courses")).sendKeys(Keys.RETURN);

        try {
       		Thread.sleep(2000);
       	} catch (InterruptedException e) {
       		// TODO Auto-generated catch block
       		e.printStackTrace();
       	}
       
        List<WebElement> courseresult= driver.findElements(By.className("course-listing-title"));
        String result= courseresult.get(0).getText();
        System.out.println("The Actual result is " + result);

        if (result.contentEquals(expectedcoursename))
        {
        	System.out.println("Course name matched");
        	driver.quit();
        }
        else
        {
        	System.out.println("Course name is different ");
        }
        
	}

}
