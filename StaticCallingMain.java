package basics;

public class StaticCallingMain
{
	 static void Method1()
	{
		System.out.println("Method 1");
	}
		
		public static void main (String[] args)
		{
         System.out.println("main method");
			Method1();
		}
	}


