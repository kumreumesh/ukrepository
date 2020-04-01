package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadHandle {

	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	    driver.get("http://demo.guru99.com/test/upload/");
	    
	    driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\Umesh\\Documents\\Sample.java");
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
	    
	    Thread.sleep(2000);
	    
	    WebElement ele=driver.findElement(By.xpath("//h3[@id='res']"));
	    
	    String val=ele.getAttribute("innerText");
	    
	    System.out.println(val);
	    
	    driver.quit();

	}

}
