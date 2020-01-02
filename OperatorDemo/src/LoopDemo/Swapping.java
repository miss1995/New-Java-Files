package LoopDemo;


class Swapping {
	int num1=10,num2=20 ,num3;
	public void swapp()
	{
	num3=num1;
	num1=num2;
	num2=num3;
	System.out.println("swapping number is"+num1);
	System.out.println("swapping number is"+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapping mg=new Swapping();
		mg.swapp();
				

	}

}

