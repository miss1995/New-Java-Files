package LoopDemo;

import java.util.Scanner;

public class Prime
{
public static void main(String[] args) 
{
	System.out.println("Enter the number");
	int num = new Scanner(System.in).nextInt();
	if (num % 2 == 0) {
	System.out.println("Not prime");
	}
	else 
	{
	System.out.println("Prime");
	}
	}
}
