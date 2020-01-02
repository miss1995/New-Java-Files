package StringDemo;
import java.util.Scanner;
public class VowelsDemo 
{
	String st;
	char ch;
     int i;
      int count=0;
	public void acc ()
	{
		System.out.println("Enter a String :");
	    Scanner sc = new Scanner(System.in);
	    st = sc.nextLine();
	    
     }

public static void main(String[] args) 
{
	VowelsDemo oo=new VowelsDemo();
	oo.acc();
}

}
