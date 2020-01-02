package TestNG;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertion 
{
	WebDriver driver;
	String path,Title,url,getTitle="",exp="test";
	@Test
	public void Launch()
	{
		SoftAssert  ast=new SoftAssert();
		//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
		 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();	
		 driver.get("https://www.google.com/");
		 getTitle=driver.getTitle();
		 Assert.assertFalse(getTitle.equals(exp)); //hard
		 System.out.println("hello"); 
		 
	//	 ast.assertEquals(driver.getTitle(),Title);//soft
		// System.out.println("hello"); 
		 

	}

}
