package OOPsDemo;

public class ParameterisedConstructorDemo 
{  
    int id;  
    String name; 
    
    //creating a parameterized constructor  
    ParameterisedConstructorDemo (int i,String n){  
    id = i;  
    name = n;  
    } 
    
    //method to display the values  
    void display()
    {
    	System.out.println(id+" "+name);
    }  
   
    public static void main(String args[])
    {  
         //creating objects and passing values  
    	ParameterisedConstructorDemo  s1 = new ParameterisedConstructorDemo (111,"Karan");  
    	ParameterisedConstructorDemo  s2 = new ParameterisedConstructorDemo (222,"Aryan"); 
    	
    //calling method to display the values of object  
       s1.display();  
       s2.display();  
   }  
}  