package basics;
import java.util.Scanner;

public class CircumferenceOfRectangle
{
   public static void main (String[]args)
   {
	   Scanner r1=new Scanner (System.in);
	   System.out.println("enter the value of Length");
	   int Length =r1.nextInt();
	   System.out.println("enter the value of width");
	   int Width=r1.nextInt();
	   int Circumference= 2*(Length+Width);
	   System.out.println("Circumference of Rectangle:"+Circumference);
   }
}
