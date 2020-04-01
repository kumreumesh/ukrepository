package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://mypage.rediff.com/login/dologin");
	    
	    driver.findElement(By.id("btn_go")).click();
	    
	    Thread.sleep(5000);
	    
	    Alert alert =driver.switchTo().alert();
	    
	    System.out.println(alert.getText());
	    
	    alert.accept();
	    
	    driver.quit();

	}

}
