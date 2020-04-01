package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		
		    System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		    
			WebDriver driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    
		    driver.manage().deleteAllCookies();
		    
		    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		    
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		 
		    Properties prop=new Properties();
		    
		    FileInputStream fin=new FileInputStream("C:\\Users\\Umesh\\eclipse-workspace\\SeleniumTestNGProject\\propertyFile\\config.properties");
		    
		    prop.load(fin);
		    
		    System.out.println("Name is :"+prop.getProperty("name"));
		    
		    System.out.println("Company is :"+prop.getProperty("company"));
		    
		    String url=prop.getProperty("URL");
		    
		    System.out.println(url);
		    
		    driver.quit();
		
	}
	

}
