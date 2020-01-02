package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotationsdemo 
{
		WebDriver driver;
		String path,Title,url,expTitle="google";
		
		@BeforeClass
		public void Launch()
		{
			System.out.println("Before Class");
		}
		@BeforeMethod
		public void Launch1()
		{
			System.out.println("Before Method");
		}
		@AfterClass
		public void Launch2()
		{
			System.out.println("After Class");
		}
		@AfterMethod
		public void Launch3()
		{
			System.out.println("After Method");
		}
		
		@BeforeSuite
		public void Launch4()
		{
			System.out.println("Before Suite");
		}
		
		@Test
		public void Launch5()
		{
			System.out.println("test suits1");
		}
		
		@Test
		public void Launch6()
		{
			System.out.println("test suits2");
		}
		
		@AfterSuite
		public void Launch7()
		{
			System.out.println("after suits");
		}
		
		
}
