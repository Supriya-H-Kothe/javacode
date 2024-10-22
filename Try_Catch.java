package assignments;

public class Try_Catch
{

	public static void main(String[] args) 
	{
		try
		{
			int x=1/1;
			System.out.println("No exception");
		}
		catch (ArithmeticException a1)
		{
			System.out.println("Arithmatic Exception");
		}
	}

}
