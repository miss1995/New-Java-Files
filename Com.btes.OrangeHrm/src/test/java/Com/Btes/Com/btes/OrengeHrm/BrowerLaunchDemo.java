package Com.Btes.Com.btes.OrengeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


public class BrowerLaunchDemo
{
	public static WebDriver driver;
	public static String path,Title;
	@BeforeSuite
	public void Launch()
	{
		//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
		 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();	
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		
     }
	
}