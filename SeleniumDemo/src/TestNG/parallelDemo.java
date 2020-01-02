package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class parallelDemo
{
	    WebDriver driver;
		String path;
		@Test
		public void Launch()
		{
			//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
			 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
			 System.out.println(path);
			 System.setProperty("webdriver.chrome.driver", path);
			 driver=new ChromeDriver();	
			 driver.get("https://www.google.com/");
		}
		@Test
		public void Launch1()
		{
			 System.setProperty("webdriver.gecko.driver","F://Tests//SeleniumDemo//Driver//geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			// Launch Application
				driver.get("https://www.google.com/");
}
		}
	
