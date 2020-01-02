package OrengeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrengeAdminClick extends OrengeHrmLogin
	{
	//WebDriver driver;
	//String path;
	//@AfterMethod
	
	@Test
	public void ogin() 
	{
	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a")).click();
	   // driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/a")).click();
	   // driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/ul/li[1]/a")).click();	
}
	}
