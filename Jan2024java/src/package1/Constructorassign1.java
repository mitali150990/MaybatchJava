
/*Assignment1------------------------------>using this keyword
Output should be in the below sequence
three parameterized constructor
default constructor
one parameterized constructor
two parameterized constructor*/


package package1;

public class Constructorassign1 {
	
	public Constructorassign1()
	{
		this(7,8,9);
		System.out.println("This is default constructor");
	}
	public Constructorassign1(int a)
	{
		this();
		System.out.println("This is one parametarized constructor");
	}
	public Constructorassign1(int a,int b)
	{
		this(5);
		System.out.println("This is two parametarized constructor");
	}
	public Constructorassign1(int a,int b,int c)
	{
		System.out.println("This is three parametarized constructor");
	}
	
	public static void main(String[] args)
	{
		Constructorassign1 cons1=new Constructorassign1(3,4);
		
	}

}
