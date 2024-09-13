package basics;
import java.lang.ArithmeticException;

public class Try_Catch 
{
	public static void main(String[]args)
	{
		try
		{
			int x=1/1;
			System.out.print("No Exception");
		}
			catch(ArithmeticException a1)
			{
				System.out.print("Arithmetic Exception");
			}
			
	}
	}


