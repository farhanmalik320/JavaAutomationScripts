package AutomationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session2Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cva\\Downloads\\ChromeDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	
        String baseUrl = "https://www.makemytrip.com/"; 
        driver.get(baseUrl);
        
        try {
       		Thread.sleep(5000);
       	} catch (InterruptedException e) {
       		// TODO Auto-generated catch block
       		e.printStackTrace();
       	}
       
       WebElement iframe_by_title = driver.findElement(By.xpath("//iframe[@title='notification-frame-173058bbb']"));
       driver.switchTo().frame(iframe_by_title);
       
       driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
       
       driver.switchTo().defaultContent();  
  
       WebElement loginbtn= driver.findElement(By.className("userLoggedOut"));
       loginbtn.click();
       
        WebElement from_city= driver.findElement(By.id("fromCity"));
        from_city.click();
        
        try {
       		Thread.sleep(5000);
       	} catch (InterruptedException e) {
       		// TODO Auto-generated catch block
       		e.printStackTrace();
       	}

        //from text
        WebElement from_text=driver.findElement(By.className("react-autosuggest__input--open"));
        from_text.sendKeys("PAK");
        
       
        //print suggestion class data
        List<WebElement> suggestion_list= driver.findElements(By.className("react-autosuggest__suggestions-list"));
        //suggestion_list[5].click()
        System.out.println("From Suggestion list countries are ");
        for (WebElement x : suggestion_list)
        {
        	  System.out.println((x.getText()));
        }
        
        List<WebElement> click_isb=driver.findElements(By.className("react-autosuggest__suggestion"));
        try {
       		Thread.sleep(5000);
       	} catch (InterruptedException e) {
       		// TODO Auto-generated catch block
       		e.printStackTrace();
       	}
        click_isb.get(3).click();
        
        
        try {
       		Thread.sleep(5000);
       	} catch (InterruptedException e) {
       		// TODO Auto-generated catch block
       		e.printStackTrace();
       	}
        
        //WebElement oneway=driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
        //oneway.click();
        
        driver.findElement(By.className("DayPicker-Day--selected")).click();

        try {
       		Thread.sleep(5000);
       	} catch (InterruptedException e) {
       		// TODO Auto-generated catch block
       		e.printStackTrace();
       	}

        WebElement to_city= driver.findElement(By.id("toCity"));
        to_city.click();

        try {
       		Thread.sleep(5000);
       	} catch (InterruptedException e) {
       		// TODO Auto-generated catch block
       		e.printStackTrace();
       	}

        //enter to text

        WebElement to_text= driver.findElement(By.xpath("//input[@placeholder='To']"));
        to_text.sendKeys("Dubai");
        
        List<WebElement> to_suggestion_list= driver.findElements(By.className("react-autosuggest__suggestions-list"));

        System.out.println(to_suggestion_list.size());
        System.out.println("To Suggestion list countries are ");
        for(WebElement suggestionslist: to_suggestion_list)
        {
        	System.out.println((suggestionslist.getText()));
        }


        try {
       		Thread.sleep(5000);
       	} catch (InterruptedException e) {
       		// TODO Auto-generated catch block
       		e.printStackTrace();
       	}

        //select islamabad
        List<WebElement> to_city_name=driver.findElements(By.className("react-autosuggest__suggestion"));
        to_city_name.get(0).click();

        try {
       		Thread.sleep(5000);
       	} catch (InterruptedException e) {
       		// TODO Auto-generated catch block
       		e.printStackTrace();
       	}
        
        driver.findElement(By.className("DayPicker-Day--selected")).click();

        WebElement search_btn= driver.findElement(By.xpath("//a[contains(text(),'Search')]"));
        search_btn.click();
	}

}
