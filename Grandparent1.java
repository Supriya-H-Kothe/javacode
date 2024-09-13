package basics;

 class Grandparent1
{
Grandparent1(int a, int b)
{
	System.out.println("1");;
}
}
 class Parent1 extends Grandparent1
{
	Parent1 (String name)
	{
		super(0,0);
		System.out.println("2");
	}
}
 class Child1 extends Parent1
{
	Child1 ()
	{
		super("ram");
		System.out.println("3");
	}
public static void main (String[]args)
{
	new Child();
	System.out.println("3");
}
}
