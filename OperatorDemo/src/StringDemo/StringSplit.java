package StringDemo;

public class StringSplit {
	String str="Ritika ghai";
	String[] arr;
	String st;
	public void acc()
	{
		arr=str.split(" ");
		System.out.println(arr[1]);
		
		//str.substring(2,5);
		//System.out.println(st);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringSplit oo=new StringSplit();
        oo.acc();
	}

}
