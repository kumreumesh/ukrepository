package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
	    
	    driver.get("http://newtours.demoaut.com/");
	    
	    String title=driver.getTitle();
	    
	    if(title.equals("Welcome: Mercury Tours"))
	    {
	    	System.out.println("Test Case passed");
	    }else 
	    {
	    	System.out.println("Test case Failed");
	    }
	    
	    
	    driver.findElement(By.linkText("REGISTER")).click();
	    
	    driver.findElement(By.name("firstName")).sendKeys("john");
	    
	    driver.findElement(By.name("lastName")).sendKeys("smith");
	    
	    driver.findElement(By.name("phone")).sendKeys("0987654321");
	   
	    driver.findElement(By.id("userName")).sendKeys("john@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Reliance Mart");
	    
	    driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Kharadi");
	    
	    driver.findElement(By.name("city")).sendKeys("Pune");
	    
	    driver.findElement(By.name("state")).sendKeys("Maharashtra");
	    
	    driver.findElement(By.name("postalCode")).sendKeys("411001");
	    
	    Select select=new Select(driver.findElement(By.name("country")));
	    
	    select.selectByVisibleText("INDIA");
	    
	    driver.findElement(By.cssSelector("#email")).sendKeys("test");
	    
	    driver.findElement(By.name("password")).sendKeys("test123");
	    
	    driver.findElement(By.name("confirmPassword")).sendKeys("test123");
	    
	    driver.findElement(By.name("register")).click();
	    	    
	    driver.quit();

	}

}
