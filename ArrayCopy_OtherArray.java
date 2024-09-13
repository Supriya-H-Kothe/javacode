package basics;

import java.util.Arrays;

public class ArrayCopy_OtherArray 
{
public static void main(String[] args) 
{
	int rollno1 []=new int[4];
	rollno1[0]=74;
	rollno1[1]=75;
	rollno1[2]=76;
	rollno1[3]=77;
	int rollno2 []=new int[4];
	for(int i=0;i<4;i++)
	{
		rollno2[i]=rollno1[i];
	}
	System.out.println(Arrays.toString(rollno1));
	System.out.println(Arrays.toString(rollno2));
	}
	
	
	
	
	
	
}

