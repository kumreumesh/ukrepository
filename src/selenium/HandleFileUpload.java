package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFileUpload {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    driver.get("https://www.zamzar.com/");
	    
	    driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).sendKeys("D:\\Wallpaper\\ManEat.jpeg");
	    
	    Select select=new Select(driver.findElement(By.name("convert-format")));
	    
	    select.selectByVisibleText("gif");
	    
	    //driver.findElement(By.id("convert-button")).click();
	    
	    //Thread.sleep(5000);
	    
	    ///driver.findElement(By.xpath("//a[text()='Download']")).click();
	    
	    driver.quit();
	    
	
	}

}
