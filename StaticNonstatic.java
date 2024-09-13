package basics;

public class StaticNonstatic
{
static void Method1()
{
	System.out.println("Method1");
}
void Method2()
{
	System.out.println("Method2");
}
	public static void main (String[]args)
	{
		System.out.println("Main method");
		StaticNonstatic s1=new StaticNonstatic();
		s1.Method2();
		Method1();
	}
}

