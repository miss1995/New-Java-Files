package StringDemo;
import java.util.Scanner;

public class BadWordsDemo {
	String[] arr= {"stupid","rascal","Nonsense"};
	//String sd;
	String str;
	public void acc()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		str=sc.nextLine();
		for(int i=0;i<arr.length;i++)
		{
		// sd=arr[i].toString();
		 if(str.contains(arr[i]));
		 {
		 str=str.replaceAll(arr[i],"******");
		 }
	   }
		System.out.println(str);
	}
   public static void main(String[] args)
   {
	// TODO Auto-generated method stub
      BadWordsDemo oo=new BadWordsDemo();
           oo.acc();
   }
}
