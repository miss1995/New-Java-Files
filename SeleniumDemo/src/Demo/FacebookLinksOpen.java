package Demo;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinksOpen {
	
		WebDriver driver;
		String path,Title,url,expTitle="Facebook",Click;
		public void Launch() throws InterruptedException
		{
		     path=System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
			 System.out.println(path);
			 System.setProperty("webdriver.chrome.driver", path);
			 driver=new ChromeDriver();	
			 driver.get("https://www.facebook.com/");
			 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			 ArrayList<WebElement> al=(ArrayList<WebElement>)driver.findElements(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li/a"));
		    for(int i=0;i<al.size();i++)
		    {
		   Click=al.get(i).getAttribute("href");
		   Thread.sleep(9000);
		   driver.navigate().back();           //to(Click);
		   driver.close();
		   
		 	}
		}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FacebookLinksOpen oo=new FacebookLinksOpen();
		oo.Launch();
	}

}
