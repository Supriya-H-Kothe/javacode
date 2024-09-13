package basics;

public class Parent
{
 void Dance()
    {
	System.out.println("I like dancing");
	}
}
class Child extends Parent
{
	void Sing()
	{
System.out.println("I like singing");
	}

	public static void main(String[]args)
	{
		System.out.println("I love Playing");
	Child i1= new Child ();
	i1.Dance();//
	i1.Sing();
	}
}

