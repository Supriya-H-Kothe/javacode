package assignments;

import java.util.Arrays;

public class Array_copy 
{

	public static void main(String[] args) 
	{
		int number[]=new int[4];
		number[0]=12;
		number[1]=23;
		number[2]=67;
		number[3]=24;
		int number1[]=new int[4];
		for(int i=0;i<4;i++)
		{
			number1[i]=number[i];
		}
		
System.out.println(Arrays.toString(number));
System.out.println("copied array-->"+Arrays.toString(number));


	}

}
