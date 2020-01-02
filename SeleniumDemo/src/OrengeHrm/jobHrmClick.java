package OrengeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class jobHrmClick extends OrengeHrmLogin
{
	@Test
	public void job() 
	{
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/a")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/ul/li[1]/a")).click();		
}
	}



