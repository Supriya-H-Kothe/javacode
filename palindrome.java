package assignments;

public class palindrome {

	public static void main(String[] args)
	{
		String input="malayalam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
		System.out.println("Input is:"+input);
		System.out.println("output is:"+output);
		if(input.equals(output)==true)
		{
			System.out.println("They are palindrome");
		}
		else
		{
			System.out.println("They are not palindrome");
		}
	}
	}
	



