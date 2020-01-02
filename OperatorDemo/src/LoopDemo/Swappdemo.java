package LoopDemo;

public class Swappdemo {
	int num1=5,num2=20;
	public void swapp()
	{
    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
	
	System.out.println("swapping is" +num1);
	System.out.println("swapping is" +num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Swappdemo mg=new Swappdemo();
     mg.swapp();
    		 
	}

}

