package LoopDemo;

import java.util.Scanner;

public class fectorial {
     int num,fect=1,i;
     Scanner sc;
     public void Fect()
     {
    	 System.out.println("Enter the your Number:");
 		sc=new Scanner(System.in);
 		num=sc.nextInt();
 		for(i=1;i<=num;i++)
 		fect=fect*i;
 		System.out.println("Result is :"+fect);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     fectorial oo=new fectorial();
     oo.Fect();
	}

}
