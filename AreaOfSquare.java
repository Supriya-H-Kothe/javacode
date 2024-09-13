package basics;
import java.util.Scanner;

public class AreaOfSquare
{
   public static void main (String[]args)
   {
	   Scanner m1= new Scanner (System.in);
	   System.out.println("Enter the value of side of Square");
	   int side =m1.nextInt();
	   int Area = side *side;
	   System.out.println("Area of Square:"+Area);
	   
   }
}
