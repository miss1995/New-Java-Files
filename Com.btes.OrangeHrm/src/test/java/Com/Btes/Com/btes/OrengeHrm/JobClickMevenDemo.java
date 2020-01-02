package Com.Btes.Com.btes.OrengeHrm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JobClickMevenDemo extends AdminClickMevenDemo
{
	@Test
	public void job() 
	{
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/a")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/ul/li[1]/a")).click();		
}
	

}
