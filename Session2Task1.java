package AutomationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session2Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cva\\Downloads\\ChromeDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
    	
        String baseUrl = "https://rahulshettyacademy.com/AutomationPractice/"; 
        driver.get(baseUrl);

        //find radio buttons on radio button
        List<WebElement> radio_btn = driver.findElements(By.className("radioButton"));
        System.out.println("The Length of the radio buttons are "+ radio_btn.size());
        
        radio_btn.get(0).click();
        
        boolean status= radio_btn.get(0).isSelected();
        System.out.println(status);
        
        System.out.println("*************************");
        System.out.println("The name of the radio buttons are");
        
        for (int i=1; i<=3; i++)
        {
            String label1 = driver.findElement(By.cssSelector("label[for='radio" + i + "']")).getText();
            System.out.println(label1);
            i++;
            String label2 = driver.findElement(By.cssSelector("label[for='radio" + i + "']")).getText();
            System.out.println(label2);
            i++;
            String label3 = driver.findElement(By.cssSelector("label[for='radio" + i + "']")).getText();
            System.out.println(label3);
            i++;
          
        }
	}

}
