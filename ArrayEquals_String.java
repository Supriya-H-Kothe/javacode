package basics;

import java.util.Arrays;

public class ArrayEquals_String 
{
	public static void main(String[] args) 
	{
    String city1[]=new String[4];
	city1[0]="Mumbai";
	city1[1]="pune";
	city1[2]="Nagpur";
	city1[3]="Banglore";
	String city2[]=new String[4];
	city2[0]="Mumbai";
	city2[1]="pune";
	city2[2]="Nagpur";
	city2[3]="Banglore";
	boolean b=Arrays.equals(city1,city2);
	System.out.println(b);
	
	

    }
}
