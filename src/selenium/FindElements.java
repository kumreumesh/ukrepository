package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.get("https://www.amazon.in/");
	    
	    List<WebElement> list=driver.findElements(By.tagName("a"));
	   
	    System.out.println("Total Page URL available is :- "+list.size());
	    
	    for(int i=0;i<list.size();i++)
	    {
	    	
	    System.out.println(list.get(i).getText());	
	    
	    }
	    
	    driver.quit();
	}

}
