package LoopDemo;

public class Febbo {
	int i,n=5,num1=0,num2=1,addnum=0;
	public void febboDemo()
	{
		for(i=1;i<n;i++);
		{
			System.out.println("febbo series:"+num1);
			addnum=num1+num2;
			num1=num2;
			num2=addnum;
			System.out.println("febbo series:"+addnum);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Febbo oo=new Febbo();
       oo.febboDemo();
	}

}
