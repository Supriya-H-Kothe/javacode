package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner1 
{
	public static void main(String[] args) 
	{
		try
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the age-->");
		int age= s1.nextInt();
		System.out.println(age);
	    }
		catch(InputMismatchException i1)
		{
			System.out.println("you enter wrong value");
			Scanner s2=new Scanner (System.in);
			System.out.println("Enter the age one more time-->");
			int age1= s2.nextInt();
			System.out.println(age1);
		}
		
		}

     }

