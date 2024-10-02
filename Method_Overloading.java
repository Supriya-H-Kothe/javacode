package assignments;

public class Method_Overloading 
{
void  Method1(int a)
{
	System.out.println("First method");
}
void  Method2(String b)
{
	System.out.println("Second method");
}
void  Method3(double d)
{
	System.out.println("Thired method");
}

	public static void main(String[] args) 
	{

		Method_Overloading m1=new Method_Overloading();
	m1.Method1(2);
	m1.Method2("Om");
	m1.Method3(3.14);

	

	}

}
