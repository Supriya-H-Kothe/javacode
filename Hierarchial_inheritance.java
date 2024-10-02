package assignments;
class Second extends Hierarchial_inheritance 
{
	void Sample1()
	{
		System.out.println("Parent class");
	}
}
public class Hierarchial_inheritance 
{
	void Sample()
	{
		System.out.println("GrandParent class");
	}
}

class Thired extends Second
{
	void Sample3()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) 
	{
		Thired t1=new Thired();
		t1.Sample();
		t1.Sample3();
		t1.Sample1();
	}

}
