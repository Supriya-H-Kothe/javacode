package basics;

import java.util.Arrays;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int number1[]=new int[5];
		number1[0]=2;
		number1[1]=4;
		number1[2]=6;
		number1[3]=8;
		number1[4]=10;
		int number2[]=new int[5];
		for(int i=0,k=4;i<5;i++,k--)
		{
			number2[k]=number1[i];
		}
		System.out.println(Arrays.toString(number1));
		System.out.println(Arrays.toString(number2));
		
		
		
	}

}
