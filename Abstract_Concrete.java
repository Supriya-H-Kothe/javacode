package assignments;
abstract class Class_abstract
{
	abstract void Method1();
	abstract void Method2();
}
public class Abstract_Concrete extends Class_abstract
{
	void Method1() 
	{
			System.out.println("abstract method1");
	}

		
		void Method2() 
		{
			System.out.println("abstract method2");
		}

public static void main(String[] args)
{
	Abstract_Concrete a1=new Abstract_Concrete();
	a1.Method1();
	a1.Method2();
}
		
	}

