package InheritenceDemo;

public class MultipleDemo  extends SingleInheritenceDemo {
	int fees,address;
	public void a()
	{
		accept();
		display();
		System.out.println("Enter the fees details");
		fees=sc.nextInt();
		
		System.out.println("Enter the address");
		address=sc.nextInt();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleDemo  oo=new MultipleDemo();
		oo.a();
       
	}

}
