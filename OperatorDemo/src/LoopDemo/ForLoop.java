package LoopDemo;
import java.util.Scanner;

public class ForLoop {
	  int num=0,i,num2;
	  Scanner sc;
	public void forloop()
	{
		System.out.println("Enter the Initial Number:");
		sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Enter the Ending Number:");
		sc=new Scanner(System.in);
		num2=sc.nextInt();
		
		for(;num>=num2;num--) {
		System.out.println("value is:" +num);
	
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ForLoop oo=new ForLoop();
      oo.forloop();
	}

}
