package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Scanner 
{
public static void main(String[]args)
{
	try
	{
		Scanner s1=new Scanner (System.in);
		System.out.println("Enter the age");
		int age=s1.nextInt();
		
	}
	catch(InputMismatchException i1)
	{
		System.out.println("Sorry you enter wrong age");
		Scanner s2=new Scanner (System.in);
		System.out.print("Enter the age once again");
		int age=s2.nextInt();
		
		
	}
	finally
	{
		System.out.print("Finally Block");
	}
}
}
