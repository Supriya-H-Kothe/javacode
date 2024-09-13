package basics;

public class String_Reverse 
{
	public static void main(String[] args) 
	{
		String input="Supriya";
		String output="";
		for (int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
		System.out.println("Input is"+input);
		System.out.println("Output is"+output);
			
		if (input==output)
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
		}
}

	