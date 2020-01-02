package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo 
{
@DataProvider(name="CheckLogin")
public Object[][]Autenticate()
{
	Object[][]arr=new Object[3][2];
	arr[0][0]="admin";
	arr[0][1]="admin1";
	
	arr[1][0]="pass";
	arr[1][1]="pass12";
	
	arr[2][0]="Demo123";
	arr[2][1]="12345";
	
	return arr;
}
@Test(dataProvider="CheckLogin")
public void login(String uname,String pass)
{
	System.out.println("uname"+uname);
	System.out.println("password"+pass);
}
}
