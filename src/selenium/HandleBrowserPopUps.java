package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopUps {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		    
			WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.manage().deleteAllCookies();
		    
		    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    driver.get("http://www.popuptest.com/goodpopups.html");
		    
		    driver.findElement(By.xpath("//a[text()='Good PopUp #1']")).click();
		    
		    Set<String>handler=driver.getWindowHandles();
		    
		    Iterator<String> itr=handler.iterator();
		    
		    String ParentWindowId=itr.next();
		    
		    System.out.println("Parent window id is:-"+ParentWindowId);
		    
            String ChildWindowId=itr.next();
		    
		    System.out.println("Child window id is:-"+ChildWindowId);
		    
		    driver.switchTo().window(ChildWindowId);
		    
		    Thread.sleep(3000);
		    
		    System.out.println("Child window title is :-"+driver.getTitle());
		    
		    Thread.sleep(2000);
		    
		    driver.close();
		    
            driver.switchTo().window(ParentWindowId);
            
            Thread.sleep(3000);
		    
		    System.out.println("Parent window title is :-"+driver.getTitle());
		    
		    
		    driver.quit();
		      
		    
	        
	        
		   // driver.quit();
		    

	}

}
