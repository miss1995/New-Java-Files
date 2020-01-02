package Encapsulation;

public class EncapDemo 
{
	public void display()
	{
		GetSetClass oo= new GetSetClass();
		oo.setRollno(11);
		oo.setMarks(78);
		System.out.println(oo.getRollno());
		System.out.println(oo.getMarks());
	}
	public static void main(String[] args) {
		EncapDemo oo=new EncapDemo();
	    oo.display();

	}

}
