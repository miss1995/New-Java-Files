package Com.Btes.Com.btes.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class FirstMevenDemo {
	WebDriver driver;
	String path,Title,url,getTitle="",exp="test";
	@BeforeSuite
	public void Launch()
	{
		//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
		 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();	
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 getTitle=driver.getTitle();
     }
	@AfterSuite
	public void Lunch1()
	{
		driver.close();
	}
}
