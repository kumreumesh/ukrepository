package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePage {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.get("https://www.google.com/");
	    
	    driver.navigate().to("https://www.facebook.com/");
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().back();
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().forward();
	    
	    driver.navigate().back();
	    
	    driver.quit();
	}

}
