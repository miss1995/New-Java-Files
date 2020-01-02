package LoopDemo;
import java.util.Scanner;

public class WhileLoop 
{
int a,i=1,ch,num,res;
char choice;
 Scanner sc=new Scanner(System.in);

public void selectChoice()
{
    do
	{
		System.out.println("Enter Your number you want to Print a table");
		num=sc.nextInt();
	for (a=1;a<=10;a++)
		{
			res=num*i;
			System.out.println(num +"*"+i+"="+res);
			i++;
		}
	
		System.out.println("Enter Your choice");	
		choice =sc.next().charAt(0);
	}

	while(choice=='y');
	}
	
   public static void main(String[]  arg)
 {
	 WhileLoop mg=new WhileLoop ();
		mg.selectChoice(); 
 }

}
