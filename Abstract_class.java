package assignments;

 abstract class Abstract_class 

{
abstract void Method1();
abstract void Method2();
static void Method3()
{
	System.out.println("Concrete method");
}
}
class Concrete extends Abstract_class
{
void Method1() 
	{
		
		System.out.println("Override method1");
	}

void Method2() 
{
	System.out.println("Override method2");
}
	
public static void main(String[] args) 
	{
		Concrete c1=new Concrete();
		c1.Method1();
		c1.Method2();
		Method3();
		
		
		
	}

}
