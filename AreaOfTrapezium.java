package basics;
import java.util.Scanner;

public class AreaOfTrapezium
{
	public static void main(String[]args)
	{
		Scanner t1=new Scanner(System.in);
		System.out.println("enter the side1:");
		float side1=t1.nextFloat();
		System.out.println("enter the side2:");
		float side2=t1.nextFloat();
		System.out.println("enter the height:");
		float height=t1.nextFloat();
		double Area= 0.5*(side1 + side2)* height;
		System.out.println("float Area:"+Area);
	}

}
