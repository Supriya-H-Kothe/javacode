package basics;/*WAP to overload a main method 
                when other main methods are non-static in nature*/

public class Overload_Main 
{
void main(int a)
{
	System.out.println("First main Method");
	}
void main(char c)
{
	System.out.println("Second main Method");
	}
void main(boolean b)
{
	System.out.println("Thired main Method");
	}
public static void main(String[]args)
{
	System.out.println("Original main method");

Overload_Main s1= new Overload_Main();
s1.main(2);
s1.main('a');
s1.main(false);
}
}