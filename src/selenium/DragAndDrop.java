package selenium;

import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().deleteAllCookies();
	    
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    driver.get("http://demo.guru99.com/test/drag_drop.html");
	    
	    Actions act=new Actions(driver);
	    
	    act.clickAndHold(driver.findElement(By.xpath("//*[@id=\"fourth\"]/a")))
	    .moveToElement(driver.findElement(By.xpath("//*[@id=\"amt7\"]/li")))
	    .release()
	    .build()
	    .perform();
	    
	    Thread.sleep(3000);
	    
	    driver.quit();

	}

}
