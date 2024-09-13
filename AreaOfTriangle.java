package basics;
import java.util.Scanner;

public class AreaOfTriangle 
{
	public static void main (String[]args)
	
	{
		Scanner d1 =new Scanner(System.in);
		System.out.println("Enter the value of height");
		float height=d1.nextInt();
		System.out.println("Enter the value of base");
		float base =d1.nextFloat();
		double Area= 0.5 *height*base;
		System.out.println("Area of reactangle is:"+Area);
	}
	

}
