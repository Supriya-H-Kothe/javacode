package basics;//WAP to find Area of Circle

import java.util.Scanner;

public class AreaOfCircle

{
	 public static void main(String[]args)
			 {
	 Scanner s1= new Scanner (System.in);
	 System.out.println("Enter the value pie");
	 float pie = s1.nextFloat();
	 System.out.println("Enter the value radius");
	 float radius = s1.nextFloat();
	 float Area =pie*radius ;
     System.out.println("Area of circle :"+Area) ;
    
}
	 
}
