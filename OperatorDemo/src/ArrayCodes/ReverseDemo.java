package ArrayCodes;

import java.util.Scanner;

public class ReverseDemo {
   int num;
    int res=0,revNum,remainder,num1;
   int temp=revNum;
    public void acc()
    {
    	System.out.println("Enter a Number you want reverse :");
	    Scanner sc = new Scanner(System.in);
	      num=sc.nextInt();
	      num1=num;
	      
	   while (num!=0)
    	{
    		remainder = num%10;
            revNum = revNum*10 + remainder;
            num /= 10;
    	}
	   System.out.println(revNum);
	   System.out.println(num);
	   
	   
           	   if(num1==revNum)
            	   {
            	System.out.println("palidrom number" );
            	   }
            else
            {
                System.out.println("Is not palidrom Number" );
            }
    	   
    	
    }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseDemo oo=new ReverseDemo();
		oo.acc();

	}

}
