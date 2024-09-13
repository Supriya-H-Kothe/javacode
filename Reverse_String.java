package basics;

public class Reverse_String 
{ 
	public static void main(String[] args) 
{ 
		String input="Supriya";
	    String output="";
	    System.out.println("The input is-->"+input);
	    for(int i=input.length()-1;i>=0;i--)
	    {
	    	char c1= input.charAt(i);
	    	output=output+c1;
	    		    			
	    }
	    System.out.println("The output is-->"+output);

	    }
}
	
	


