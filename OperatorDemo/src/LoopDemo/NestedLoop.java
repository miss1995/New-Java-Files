package LoopDemo;

public class NestedLoop {
int i,j,k;
public void NestedDemo()
{
 for(int i=1;i<=4;i++)
 {
	 for(int j=1;j<=i-1;j++)
	 {
		 System.out.print(" ");
	 }
		for(k=4;k>=i;k--) 
		{
		 System.out.print(" *");
	    }
	 System.out.println();
	 }	 
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      NestedLoop oo=new NestedLoop();
      oo.NestedDemo();
	}

}
