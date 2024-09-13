package basics;

public class Math_Random1 
{
	final static double  pie=Math.PI;
	public static void Area()
	{
	for(int i=1;i<=10;i++)
	{

double r=Math.random();
System.out.println("the radius of circle is -"+r);
double a=pie*r*r;
System.out.println("Area of circle is -"+a);
	}
}
public static void main (String[]args)
	{
		
Area();
}
}
