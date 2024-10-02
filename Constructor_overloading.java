package assignments;

public class Constructor_overloading 
{
	Constructor_overloading(int a)
	{
		System.out.println("first constructor");
	}
	Constructor_overloading(double l)
	{
		System.out.println("second constructor");
	}
	Constructor_overloading(String s,boolean b)
	{
		System.out.println("thired constructor");
	}
	public static void main(String[] args) 
	{
		new Constructor_overloading(12);
		new Constructor_overloading(3.14);
		new Constructor_overloading("sai",false);
		
		
	}

}
