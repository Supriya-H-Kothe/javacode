package basics;

public class String_Palindrome 
{
	public static void main(String[] args) 
	{
		String input="Manish";
		String output="";
		System.out.println("input is -->"+input);
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
	   System.out.println("output is -->"+output);
		if(input.equals(output)==true)
	{
		System.out.println("It is palindrome");
	}
	//else
		{
			//System.out.println("It is not a palindrome");
		}
		}
	}
	
	



