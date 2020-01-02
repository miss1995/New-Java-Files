package LiqrooAppDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiqrooDemo
{
	WebDriver driver;
	String path;
	WebElement popup;
   public void search() throws InterruptedException
	{
		 path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
		 System.out.println(path);
		 System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();	
		 driver.get("https://liqroo.com/");
		 driver.findElement(By.id("age-popup"));
		 popup=driver.findElement(By.xpath("//*[@id=\"age-popup\"]/div/div/div[1]/a"));
		 if(popup.isDisplayed()) {
			 	popup.click();
			 	System.out.print("gotit");
		 }
		 else {
			 System.out.println("notfound");
		 }
		 
	}
  public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LiqrooDemo oo=new LiqrooDemo();
		oo.search();
	}

}
