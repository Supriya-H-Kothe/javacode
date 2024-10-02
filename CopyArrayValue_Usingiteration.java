package assignments;

import java.util.Arrays;

public class CopyArrayValue_Usingiteration {

	public static void main(String[] args) 
	{
		int number1[]=new int[4];
		number1[0]=12;
		number1[1]=22;
		number1[2]=12;
		number1[3]=22;
		int number2[]=new int[4];
		for (int i=0;i<number1.length;i++)
		{
			number2[i]=number1[i];
		}
System.out.println("Copied Array"+Arrays.toString(number2));

	}

}
