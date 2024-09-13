package basics;

import java.util.Arrays;

public class String_Anagram 
{
public static void main(String[] args) 
{
	String s1="angle";
    String s2="angel";
char[]c1=s1.toCharArray();
char[]c2=s2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
System.out.println(Arrays.toString(c1));
System.out.println(Arrays.toString(c2));
boolean b1=Arrays.equals(c1,c2);
System.out.println(b1);
if(b1==true)
{
	System.out.println("Strings are anagram");
}
}

}

