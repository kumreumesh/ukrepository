package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    
	    driver.get("https://www.spicejet.com/");
	    
	    Actions act=new Actions(driver);
	    
	    act.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
	    
	    //act.moveToElement(driver.findElement(By.linkText("Add-Ons"))).build().perform();
	    
	   // Thread.sleep(5000);
	    
	    driver.findElement(By.linkText("MyFlexiPlan")).click();
	    
	    String text=driver.getTitle();
	    
	    if(text.equals("My Flexi Pla"))
	    {
	        System.out.println("Test Case Passed");	
	    }
	    else 
	    {
	    	System.out.println("Test Case Faied");		
	    	
	    }
	    
	    driver.quit();

	}

}
