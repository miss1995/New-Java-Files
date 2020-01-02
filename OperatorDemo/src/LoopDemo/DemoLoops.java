package LoopDemo;

public class DemoLoops {
	int i,j,k=5,n;
	public void Demo() 
	{
		for(i=1;i<=k;i++) 
		{
			for(j=1;j<=i;j++)
			{
					System.out.print("*");
			    }
				 System.out.println();
		    }
		for(i=1;i<=k;i++) 
		{
			for(j=4;j>=i;j--)
			{
					System.out.print("*");
			    }
				 System.out.println();
		    }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DemoLoops mg=new DemoLoops();
     mg.Demo();
	}

}
