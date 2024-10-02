package assignments;
class Super_class
{

void A()
{

System.out.println("superclass method");
}
}

public class Method_overriding extends Super_class
{
void A()
{
	System.out.println("subclass method");
	super.A();
}

public static void main(String[] args) 
	{
	Method_overriding m1=new Method_overriding();
     m1.A();
	}

}

