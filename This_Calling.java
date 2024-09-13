package basics;

public class This_Calling 
{
	This_Calling(int a)
	{
		System.out.println("1");
	}
	This_Calling()
	{
		this(10);
		System.out.println("2");
	}
	public static void main (String[]args)
	{
		This_Calling  t1=new This_Calling();
	}
	
}
	


