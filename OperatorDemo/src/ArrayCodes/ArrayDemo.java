package ArrayCodes;
import java.util.Scanner;

public class ArrayDemo 
{
int num,i,key=10, count=0;
public void acc()
{
	System.out.println("Enter a Aarry list:");
    Scanner sc = new Scanner(System.in);
          num = sc.nextInt();
          
          int[] Array = new int [num];
          
        for(int i=0;i<num;i++)
          {
        	 Array[i]=sc.nextInt(); 
          }
        for(i=0;i<num;i++)
        {
        	if(Array[i]==key)
        	{
        		System.out.println("Matched");
        	}
        	else
        	{
        		System.out.println("No");
        	}++count;
        }
       	System.out.println("Freq is" +count);   
}
	        
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayDemo oo=new ArrayDemo();
		oo.acc();
	}
}


