package assignments;

import java.util.Arrays;

public class Arraycopy_Reverse {

	public static void main(String[] args) 
	{
		int number[]=new int[4];
		number[0]=12;
		number[1]=23;
		number[2]=67;
		number[3]=24;
		int number1[]=new int[4];
		for (int i=0,k=3;i<4;i++,k--)
		{
			number1[k]=number[i];
		}
		System.out.println("copied Array-->"+Arrays.toString(number1));
	}

}
