package SwitchCase;
import java.util.Scanner;

public class SwitchCode {
	int mh1,mh2,choice,ch,cho,choi,choic,tq,tp,a=1000;
	Scanner sc;
	public void selectChoice()
	{
		System.out.println("1.Pizza\t\t2.French Fries");
		System.out.println("Enter Your choice");
		sc=new Scanner(System.in);
		ch=sc.nextInt();
		System.out.println("Enter Your Flavour:");
		System.out.println("1.Chees\t2.Corn\t3.Farm House");
		sc=new Scanner(System.in);
		cho=sc.nextInt();
		System.out.println("Enter the Size:");
		System.out.println("1.Large\t\t2.Medium\t3.Small");
		sc=new Scanner(System.in);
		choi=sc.nextInt();
		System.out.println("Enter Quantity:");
		sc=new Scanner(System.in);
		tq=sc.nextInt();
		tp=a*tq;
		System.out.println("Pay:"+tp);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCode mg=new SwitchCode();
		mg.selectChoice();
		

	}

}
