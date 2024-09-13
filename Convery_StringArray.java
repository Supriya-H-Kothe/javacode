package basics;

import java.util.Arrays;

public class Convery_StringArray 
{
public static void main(String[] args) 
	{
	String s1="manish";
	char [] c1=s1.toCharArray();
	System.out.println(c1[3]);//for character at perticular index
	System.out.println(Arrays.toString(c1));//For string printing
	
	Arrays.sort(c1);
	System.out.println(Arrays.toString(c1));
	

	}

}
