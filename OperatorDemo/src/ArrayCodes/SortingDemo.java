package ArrayCodes;
import java.util.Scanner;
public class SortingDemo 
{
int n,temp,s,i;
public void acc()
{
	System.out.println("Enter the number of elements:");
  	Scanner sc = new Scanner(System.in);
    n=sc.nextInt();         
    System.out.println("Enter the elements of the array to be sorted:");
    s=sc.nextInt();
    int[] Arr = new int [s];    
    for(i=0;i<Arr.length;i++)  
    {
    	Arr[i]=sc.nextInt();
    }
    {
    	 for(i=0;i<Arr.length;i++) 
    	 {
         for(int j=i+1;j<Arr.length;j++)
         {
        	if(Arr[i]>Arr[j])
        	{
        		temp=Arr[i];
        		Arr[i]=Arr[j];
        		Arr[j]=temp;
        	}
        } 
     }
     System.out.println();       
        for(int i=0;i<Arr.length;i++)
        {
         System.out.print(Arr[i]);
        }
} 
}
	public static void main(String[] args) 
	{
		SortingDemo oo= new SortingDemo();
		oo.acc();
	}

}
