package basics;

import java.util.Arrays;

public class Arraycopy_Reversedirection 
{
	public static void main(String[] args) 
{
	int array1[]=new int[4];
	
	array1[0]=85;
	array1[1]=95;
	array1[2]=99;
	array1[3]=15;
	int array2[]=new int[4];
	
	

	for(int i=0,k=3;i<array1.length;i++,k--)
	{
		array2[k]	=	array1[i];
		
	}
	
	System.out.println(Arrays.toString(array1));
	System.out.println(Arrays.toString(array2));

}

}


