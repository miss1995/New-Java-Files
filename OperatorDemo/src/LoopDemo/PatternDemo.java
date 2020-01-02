package LoopDemo;

public class PatternDemo {
	int i,j,k,l;
	public void acc()
	{
		for(i=1;i<=4;i++) 
		{
		for(j=4;j>=i;j--)
		{
		  System.out.print(" ");	
		}
		for(k=1;k<=i;k++) 
		{
			System.out.print("*");	
		}
		for(l=2;l<=i;l++)
		{
		     System.out.print("*");	
		}
		System.out.println();	
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternDemo  oo=new PatternDemo();
	      oo.acc();
	}

}
