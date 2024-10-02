package assignments;

public class Find_Speces_letter_numbers {

	public static void main(String[] args) 
	{
	  int countofnumbers=0;
	  int countofalphabets=0;
	  int countofspaces=0;
	  int countofspecialcharacters;
	  String s1="Supriya 987654321 %&";
	  char[]c1=s1.toCharArray();
	  for (int i=0;i<s1.length();i++) 
	  {
		  boolean b=Character.isAlphabetic(c1[i]);
		  if (b==true)
		  {
			  countofalphabets++;
			  
		  }
		  
	  }
	  for (int i=0;i<s1.length();i++) 
	  {
		  boolean b=Character.isDigit(c1[i]);
		  if (b==true)
		  {
			   countofnumbers++;
			  
		  }
		  
	  }
	  for (int i=0;i<s1.length();i++) 
	  {
		  boolean b=Character.isWhitespace(c1[i]);
		  if (b==true)
		  {
			  countofspaces++;
			  
		  }
		  
	  }
	  System.out.println("The number of spaces are-->"+countofspaces);
	  System.out.println("The number of alphabets are-->"+countofalphabets);
	  System.out.println("The number of digits are-->"+countofnumbers);
	  int noofspecialcharacter=s1.length()-(countofspaces+countofnumbers+countofalphabets);
	  System.out.println(noofspecialcharacter);
	}

}
