package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenShot {

	public static void main(String[] args)throws IOException {
		
		    System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		    
			WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.manage().deleteAllCookies();
		    
		    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    driver.get("http://newtours.demoaut.com/");
		    
		    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    
		    FileUtils.copyFile(src,new File("./screenshot//newtours2.jpg"));
		    
		    driver.quit();
		    	

	}

}
