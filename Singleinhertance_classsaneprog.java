package assignments;

public class Singleinhertance_classsaneprog 
{
void Method1()
{
	System.out.println("superclass method");
}
 class Child extends Singleinhertance_classsaneprog
{
void Method2()
{
	System.out.println("sub-class method");
}
}
public static void main(String[] args) 
{
	Singleinhertance_classsaneprog s1=new Singleinhertance_classsaneprog();
		s1.Method1();
	}

}
