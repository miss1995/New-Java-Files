package StringDemo;
import java.util.Scanner;

public class CheckLogin 
{

	String uname,pass;
	Scanner sc=new Scanner(System.in);
	public void check()
	{
		System.out.println("Enter Username");
		uname=sc.next();
		
		System.out.println("Enter Password");
		pass=sc.next();
		
		if(uname.equals("admin")&& pass.equals("admin"))
		{
			System.out.println("You are a valid user");
		}
		else
		{
			System.out.println("You are not a valid user");
		}	
}
	public static void main(String[] args) 
	{
		CheckLogin cl=new CheckLogin();
		cl.check();
	}
}
