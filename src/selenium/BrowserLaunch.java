package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
    
	WebDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.manage().deleteAllCookies();
    
    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    
    driver.get("http://newtours.demoaut.com/");
    
    driver.quit();
    
    
	}

}
