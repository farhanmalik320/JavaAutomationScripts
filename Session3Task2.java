package AutomationTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session3Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cva\\Downloads\\ChromeDRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
    	
        String baseUrl = "https://demoqa.com/automation-practice-form"; 
        driver.get(baseUrl);
        
        int i=0;
        int j=1;
        
        String [] firstname={"farhan", "Soha", "Gohar", "Basit", "Mohsin", "Zeeshan", "Shair"}; 
        String [] lastname= {"Sharif", "Manzoor", "Ali", "Scientist", "Riaz", "Shah", "Ali"};
        String [] email= {"farhan@yopmail.com", "soha@yopmail.com", "gohar@yopmail.com", "basit@yopmail.com", "mohsin@yopmail.com", "zeeshan@yopmail.com", "shair@yopmail.com"};
        String [] mobileno= {"1234567890", "1234567890", "1234567890", "1234567890", "1234567890", "1234567890", "1234567890"};
        
        System.out.println(firstname.length);
        
        while(i < firstname.length)
        {
           //name field
        	
           WebElement element = new WebDriverWait(driver, Duration.ofSeconds(2000)).until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
           WebElement first_name= driver.findElement(By.id("firstName"));
           first_name.sendKeys(firstname[i]);
           
           WebElement element2 = new WebDriverWait(driver, Duration.ofSeconds(2000)).until(ExpectedConditions.elementToBeClickable(By.id("lastName")));
           WebElement last_name= driver.findElement(By.id("lastName"));
           last_name.sendKeys(lastname[i]);
           
           WebElement element3 = new WebDriverWait(driver, Duration.ofSeconds(2000)).until(ExpectedConditions.elementToBeClickable(By.id("userEmail")));
           WebElement user_email= driver.findElement(By.id("userEmail"));
           user_email.sendKeys(email[i]);
           
           WebElement radio_button = new WebDriverWait(driver, Duration.ofSeconds(2000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Male')]")));

           JavascriptExecutor js = (JavascriptExecutor)driver;
         //  js.executeScript("arguments[0].click();", button);
  	     //  js.executeScript("window.scrollTo(100,document.body.scrollHeight)")

  	       if(i == 1)
  	       {
  	    	   
  	         WebElement female_radio = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
    	     js.executeScript("arguments[0].click()", female_radio);
  	       }
    	    else
    	    { 
    	    WebElement  male_radio1= driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
  	        js.executeScript("arguments[0].click()", male_radio1);
  	       }

  	     WebElement user_number=driver.findElement(By.id("userNumber"));
  	     user_number.sendKeys(mobileno[i]);

  	     WebElement  dob=driver.findElement(By.id("dateOfBirthInput"));
  	     js.executeScript("arguments[0].click()", dob);

  	      // #calendar popup
  	     
  	    // Select objSelect =new Select(driver.findElement(By.id("search-box")));
  	   // objSelect.selectByVisibleText("Automation");

  	     Select select_month= new Select(driver.findElement(By.className("react-datepicker__month-select")));
  	     select_month.selectByIndex(1);
  	      

  	     Select select_year=new Select(driver.findElement(By.className("react-datepicker__year-select")));
  	      select_year.selectByValue("1996");

  	       WebElement select_day= driver.findElement(By.className("react-datepicker__day--007"));
  	       js.executeScript("arguments[0].click()", select_day);

  	       WebElement subject=driver.findElement(By.id("subjectsInput"));
  	    	subject.sendKeys("Computer Science");
  	       driver.findElement(By.id("subjectsInput")).sendKeys(Keys.RETURN);

  	       WebElement hobbies=driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
  	       js.executeScript("arguments[0].click()", hobbies);

  	     WebElement upload_pic=driver.findElement(By.id("uploadPicture"));
  	   upload_pic.sendKeys("F://NFT_s//lifejoke//12.png");

    	    WebElement  current_address=driver.findElement(By.id("currentAddress"));
    	    current_address.sendKeys("Rawalpindi, Isb");

  	       //driver.execute_script("document.body.style.zoom='50%'")

  	       driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);

  	     // current_state=driver.find_element(By.XPATH,"//div[contains(text(),'Select State')]").click()

  	       WebElement state_name= driver.findElement(By.id("react-select-3-input"));
  	    	state_name.sendKeys("Haryana");

  	    	WebElement state_name1= driver.findElement(By.id("react-select-3-input"));
  	    	state_name.sendKeys(Keys.RETURN);
  	    			
  	//  select_haryana=driver.find_element(By.XPATH,"//div[contains(text(),'Haryana')]").click();

  			WebElement next_state= driver.findElement(By.id("react-select-3-input"));
  			next_state.sendKeys(Keys.TAB);
  	      //city=driver.find_element(By.XPATH,"//div[contains(text(),'Select City')]")
  	      // driver.execute_script('arguments[0].click()', city)


  			WebElement select_city=driver.findElement(By.id("react-select-4-input"));
  			select_city.sendKeys("Karnal");
  						
  			WebElement  city= driver.findElement(By.id("react-select-4-input"));
  					city.sendKeys(Keys.RETURN);
  	     
  		   WebElement submit_btn = new WebDriverWait(driver, Duration.ofSeconds(2000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submit']")));

  		 WebElement submitbtn=driver.findElement(By.xpath("//button[@id='submit']")); 
  	       js.executeScript("arguments[0].click()", submitbtn);

  	     try {
        		Thread.sleep(2000);
        	} catch (InterruptedException e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        	}

  	       WebElement close_btn=driver.findElement(By.id("closeLargeModal"));
  	       js.executeScript("arguments[0].click()", close_btn);
  	       
  	     try {
     		Thread.sleep(2000);
     	} catch (InterruptedException e) {
     		// TODO Auto-generated catch block
     		e.printStackTrace();
     	}
  	       

  	       i+=1;
  	       j+=1;
  	       
        }
     System.out.println("Test case completed successfully");
     driver.quit();
	}
}
