package basics;
import java.util.Scanner;


public class CircumferenceOfSquare 
{
  public static void main (String[]args)
  {
    Scanner s1= new Scanner (System.in);
    System.out.println("Enter the value of side of square");
    int side=s1.nextInt();
    int Circumference=4*side;
    System.out.println("Circumference of Square :"+Circumference);

    }
}
