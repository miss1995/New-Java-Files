package Com.Btes.Com.btes.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SecondMevenDemo extends FirstMevenDemo 
{
	@Test

	public void Login() 
	{
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
	    driver.findElement(By.id("btnLogin")).click();
	    
	}
}
