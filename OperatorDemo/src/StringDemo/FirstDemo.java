package StringDemo;

public class FirstDemo 
{
	String str="Ritika"; //literal
	String str1= new String("Pooja"); //Heap Memory
	String st;
	
	public void check()
	{
		//System.out.println(str);
		//System.out.println(str1);
		//System.out.println(str+str1);
		//str.charAt(1);
		//System.out.println(str);
		//st=str.concat(str1);
		int count=st.length();
		System.out.println(count);
		char reverse=' ';
		for(int i=str.length()-1;i>0;i--)
		{
			//reverse=reverse+str.charAt(i);
		}
		
	}
	
	public static void main(String[] args) 
	{
		FirstDemo fd= new FirstDemo();
		fd.check();

	}

}
