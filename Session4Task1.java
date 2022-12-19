package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.util.List;

public class Session4Task1 {
	
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\cva\\\\Downloads\\\\ChromeDRIVER\\\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.zameen.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        Thread.sleep(2000);

        WebElement iframeByTitle = driver.findElement(By.xpath("//iframe[@title='3rd party ad content']"));
        driver.switchTo().frame(iframeByTitle);
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".close_cross_big")).click();
        driver.switchTo().defaultContent();

        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.className("ef5cccac")));
        
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text()
        
        driver.findElement(By.className("ef5cccac")).click();

        new WebDriverWait(driver,  Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.className("d92d11c7")));
        driver.findElement(By.className("d92d11c7")).click();

        new WebDriverWait(driver,  Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.className("ad90f871")));
        driver.findElement(By.className("ad90f871")).click();

        new WebDriverWait(driver,  Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("span._7b974735.fontCompensation")));
        driver.findElement(By.cssSelector("span._7b974735.fontCompensation")).click();
        Thread.sleep(2000);

        List<WebElement> minPrice = driver.findElements(By.className("_12173fb7"));
        minPrice.get(0).sendKeys("100");
        Thread.sleep(2000);

        List<WebElement> maxPrice = driver.findElements(By.className("_12173fb7"));
        maxPrice.get(1).sendKeys("50,000");

        new WebDriverWait(driver,  Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("span._7b974735.fontCompensation")));
        
        WebElement price = driver.findElement(By.cssSelector("span._7b974735.fontCompensation"));
        price.click();

        Thread.sleep(2000);
        
        List<WebElement> marla = driver.findElements(By.className("ef5cccac"));
        marla.get(3).click();

        Thread.sleep(2000);
        
      
        List<WebElement>min_marla = driver.findElements(By.className("_12173fb7"));
        min_marla.get(0).sendKeys("0");

        Thread.sleep(2000);

        List<WebElement> max_marla = driver.findElements(By.className("_12173fb7"));
  		max_marla.get(1).sendKeys("10");
  		
  		Thread.sleep(2000);
  		
  		List<WebElement> marla1 = driver.findElements(By.className("ef5cccac"));
 		marla1.get(3).click();

 		Thread.sleep(2000);
 		List<WebElement> bed = driver.findElements(By.className("ef5cccac"));
  		bed.get(4).click();
  		
  		Thread.sleep(2000);

  		List<WebElement> select_bedroom = driver.findElements(By.className("d92d11c7"));
  		select_bedroom.get(4).click();

        Thread.sleep(2000);

        List<WebElement> bed1 = driver.findElements(By.className("ef5cccac"));
        bed1.get(4).click();
        
        new WebDriverWait(driver,  Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.className("_22dc5e0a")));

        WebElement find_btn = driver.findElement(By.className("_22dc5e0a"));
        find_btn.click();
    }
}