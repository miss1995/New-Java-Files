package InheritenceDemo;

public class SingleDemo2  extends SingleInheritenceDemo{
	int java,manual;
	public void acc()
	{
		accept();
		display();
		System.out.println("Enter marks of java");
		java=sc.nextInt();
		
		System.out.println("Enter marks of Manual testing");
		manual=sc.nextInt();
	}

	public void disp()
	{
		System.out.println("Marks of java is :"+java);
		System.out.println("Marks of manual :"+manual);
	
	}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDemo2 oo=new SingleDemo2();
		oo.acc();
		oo.disp();
	}

}
