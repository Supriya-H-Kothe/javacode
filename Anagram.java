package assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
String s1="silent";
String s2="listen";
char []c1=s1.toCharArray();
char []c2=s2.toCharArray();
System.out.println(Arrays.toString(c1));
System.out.println(Arrays.toString(c2));
Arrays.sort(c1);
Arrays.sort(c2);
boolean b=Arrays.equals(c1, c2);
if(b==true)
{
	System.out.println("They are anagram");
}
		
	}

}
