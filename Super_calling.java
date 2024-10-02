package assignments;

public class Super_calling
{
	Super_calling(int a)
	{
		System.out.println("parent class constructor");
}
}
	class Sample extends Super_calling
	{
		Sample()
		{
			super(12);
			System.out.println("child class constructor");
		}
	

	public static void main(String[] args) 
	{
    new Sample();
	}
	}


