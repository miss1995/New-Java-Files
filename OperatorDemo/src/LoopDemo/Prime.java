package LoopDemo;

import java.util.Scanner;

public class Prime
{
public static void main(String[] args) 
{
	int num=0;
	int prime=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbe to check");
	num=sc.nextInt();
	if(num%2==0 && num>=2)
	{
	prime=0;

	}
	else
	{
	prime=1;
	}
	if(prime==0)
	{
	System.out.println(" prime number");
	
	}
	else
	{
	System.out.println("not prime number");
	
	}
	}
}
