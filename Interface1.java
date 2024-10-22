package assignments;
interface Sample
{
	void Method1();
	void Method2();
}

public class Interface1 implements Sample 
{

public void Method1() 
{
		System.out.println("Method1 of Interface");
		
	}

	
public void Method2() 
{
		
	System.out.println("Method 2 of Interface");	
}
public static void main(String[] args) 
	{
	Interface1 i1=new Interface1();
	i1.Method1();
	i1.Method2();

	}

}
