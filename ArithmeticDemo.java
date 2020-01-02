public class ArithmeticDemo
{
    int x=2,y=3,z;
    public void add()
	{
    z=x+y;
	System.out.println("additon is=" +z);
	}
	public void sub()
	{
    z=x-y;
	System.out.println("sub is =" +z);
	}
    public static void main(String[] ar)
	{
    ArithmeticDemo ad=new ArithmeticDemo();
    ad.add();
	ad.sub();
	
    }
}

