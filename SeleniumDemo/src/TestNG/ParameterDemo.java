package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo
{
	@Parameters({"username"})
@Test
	public void Login(String Uname)
	{
		System.out.println("Username"+Uname);
	}

}
