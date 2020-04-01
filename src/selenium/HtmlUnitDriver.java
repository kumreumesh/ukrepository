package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUnitDriver  {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		    
			WebDriver driver=new org.openqa.selenium.htmlunit.HtmlUnitDriver();
			
			driver.manage().window().maximize();
		    
		    driver.manage().deleteAllCookies();
		    
		    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		    
		  	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    driver.get("https://www.google.com/");
		    
		    System.out.println(driver.getTitle());
		    
		    System.out.println(driver.getTitle());
		    
		    driver.quit();
		    

		   
	}

}
