package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch{

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		    
			WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.manage().deleteAllCookies();
		    
		    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    driver.get("https://www.google.com/");
		    
		    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("guru99");
		    
		    driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@id=\"fbar\"]/div/div/div/span")).click();
		    
		    Thread.sleep(3000);
		    
		    driver.navigate().to("https://www.guru99.com/");
		    
		    System.out.println(driver.getTitle());
		    
		  /** 
		    
		   WebElement ele= driver.findElement(By.xpath("//input[@data-ved='0ahUKEwjAmrClqrjoAhUh6nMBHZc3ANwQ4dUDCAo']"));
		   
		   JavascriptExecutor js=((JavascriptExecutor)driver);
		   js.executeScript("arguments[0].click();", ele);
		    //mywait(driver, ele, 30);
		     * 
		     * 
		     */
		    driver.quit();
		    
	}
	public static void mywait(WebDriver d,WebElement ele,long t)
	{
	new WebDriverWait(d, t).ignoring(StaleElementReferenceException.class).
	until(ExpectedConditions.elementToBeClickable(ele));
	ele.click();
	}
	

}
