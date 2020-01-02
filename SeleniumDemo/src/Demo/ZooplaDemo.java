package Demo;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZooplaDemo {

	private static final String WebElement = null;
	WebDriver driver;
	public void Launch() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
			 String path = System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
			 System.out.println(path);
			 System.setProperty("webdriver.chrome.driver",path);
			 ChromeDriver driver = new ChromeDriver();
			// driver.manage().deleteAllCookies();
			 driver.get("https://www.zoopla.co.uk/");
			 driver.findElement(By.name("q")).sendKeys("Landon");
			 driver.findElement(By.id("search-submit")).submit();
			 driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2[1]/a")).click();
			 @SuppressWarnings("unchecked")
			 ArrayList<WebElement> al=(ArrayList<WebElement>) driver.findElements(By.cssSelector("[class$='price']"));
			 //Thread.sleep(2000);
			  for(int i=1;i<al.size();i++)
			 {
				 //System.out.println(al.get(i).getAttribute());
				 System.out.println(al.get(i).getText());
				 
			 }
		}	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ZooplaDemo oo=new  ZooplaDemo();
				 oo.Launch();
	}

}
