package basics;

public class Super_Keyword
{
public  void Method1()
{
	System.out.println("Superclass");
}
}
class Child_Class extends Super_Keyword
{
public void Method1()
{
	super.Method1();
	System.out.println("Child-class");
}
public static void main (String[]args)
{
Child_Class m1=new Child_Class();
m1.Method1();
}
}
