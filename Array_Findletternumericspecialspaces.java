package basics;



	public class Array_Findletternumericspecialspaces 
	{

		public static void main(String[] args) 
		{
			int count_of_alphabet=0;
			int count_of_numeric=0;
			int count_of_space=0;
			int count_of_sepcialchar=0;
			String a="manish Kumar 8574524578 m";
			char []c1=			a.toCharArray();
			for(int i=0;i<a.length();i++)
			{
		boolean b1=	Character.isLetter(c1[i]);
			if(b1==true)
			{
				count_of_alphabet++;
			
				
			}
			}
			System.out.println("The number of alphabets are:- "+count_of_alphabet);
			
			//**********************************************************
			for(int i=0;i<a.length();i++)
			{
		boolean b2=	Character.isDigit(c1[i]);
			if(b2==true)
			{
				count_of_numeric++;
			}
			}
			System.out.println("The number of numeric are:- "+count_of_numeric);
			//**********************************************************
			for(int i=0;i<a.length();i++)
			{
		boolean b3=	Character.isWhitespace(c1[i]);
			if(b3==true)
			{
				count_of_space++;
			}
			}
			System.out.println("The number of spaces are:- "+count_of_space);

		}
	}


