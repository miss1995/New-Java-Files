package Demo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FatchTableDataDemo 
{
	WebDriver driver;
	int rowNumber,colNumber;
	public void Launch() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome.driver","F:\\Selenium software\\chromedriver.exe");
			 String path = System.getProperty("user.dir") +"//Driver//chromedriver.exe"; 
			 System.out.println(path);
			 System.setProperty("webdriver.chrome.driver" ,path);
			 ChromeDriver driver = new ChromeDriver();	
			 driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
			 rowNumber= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
			 System.out.println("No of Rows " + rowNumber);
			 
			colNumber= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td")).size();
			 System.out.println("No of Columns " + colNumber);
			 
			 ArrayList<WebElement> al=(ArrayList<WebElement>)driver.findElements(By.id("leftcontainer"));
			 for(int i=0;i<al.size();i++)
			 {
				 //System.out.println(al.get(i).getAttribute());
				 System.out.println(al.get(i).getText());
			 }
			}
   public static void main(String[] args) throws InterruptedException 
		{
			FatchTableDataDemo oo=new FatchTableDataDemo();
		      oo.Launch();
		}
		
}

