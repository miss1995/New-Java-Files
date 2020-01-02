package TestNGApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver 
{
public static String path;
public static WebDriver driver;
@BeforeSuite
public void Launch()
{
path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
System.out.println(path);
System.setProperty("webdriver.chrome.driver", path);
driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
}
@AfterSuite(groups= {"Sanity"})
public void close_browser() 
{
	driver.close();
}
}
