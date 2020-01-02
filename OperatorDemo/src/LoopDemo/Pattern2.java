package LoopDemo;

public class Pattern2 {



	int i,j,k,l;
	public void acc()
	{
		for(i=1;i<=4;i++) 
		{
		for(j=4;j>=i;j--)
		{
		  System.out.print(" ");	
		}
		for(k=2*i-1;k<=i;k++) 
		{
			System.out.print("*");	
		}
		
		System.out.println();	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern2 oo=new Pattern2();
	      oo.acc();
	}

}
