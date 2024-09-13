package basics;
import java.util.Scanner;

public class CircumferenceOfCircle
{
	public static void main(String[]args)
	{
		Scanner c1=new Scanner (System.in);
	  System.out.println("Enter the value of pie");
	  float pie=c1.nextFloat();
	  System.out.println("enter the value of radius");
	  float radius=c1.nextFloat();
	  float circumference=2*pie*radius;
	  System.out.println("Circumference of circle:"+circumference);
	} 

}
