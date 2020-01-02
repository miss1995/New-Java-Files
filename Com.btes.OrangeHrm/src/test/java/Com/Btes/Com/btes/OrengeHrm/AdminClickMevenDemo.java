package Com.Btes.Com.btes.OrengeHrm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AdminClickMevenDemo extends  LoginMevenDemo
{
        @Test
		public void ogin() 
		{
		    driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a")).click();
		 }
}



