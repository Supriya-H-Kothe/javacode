package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class AcceptInput_Runtime {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int number[]=new int[4];
		for (int i=0;i<4;i++)
		{
			number[i]=s1.nextInt();
		}
		
System.out.println(Arrays.toString(number));
	}

}
