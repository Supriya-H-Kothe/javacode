package assignments;

public class This_callingstatement 
{ 
	This_callingstatement ()
	{
		System.out.println("first method");
	}
	This_callingstatement (int a)
		{   
		 this();
			System.out.println("second method");
		}
		 

	public static void main(String[] args) 
	{
		new This_callingstatement (12);
	}

}
