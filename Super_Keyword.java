package assignments;
class Superclass
{
	void Method1()
	{
		System.out.println("superclass method");
	}
}
public class Super_keyword  extends Superclass
{
	void Method1()
	{
		System.out.println("subclass method");
		super.Method1();
	}
	public static void main(String[] args)
	{
		
		Super_keyword s1=new Super_keyword();
         s1.Method1();
	}

}
