package basics;//WAP to find Area of Rectangle


import java.util.Scanner;

public class AreaOfRectangle
{
	public static void main (String[]args)
	{
		Scanner s2 = new Scanner (System.in);
		System.out.println("Enter the value of length");
		int length = s2.nextInt();
		System.out.println("Enter the value of width");
		int width=s2.nextInt();
		int Area = length*width;
		System.out.println("Area of Rectangle"+Area);
		
		
		
		
	}

}
