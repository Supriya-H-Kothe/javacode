package basics;
interface INT
{
	void add();
	void sub();
	
}

public class Class_InterfaceProg implements INT
{

	
	public void add()
	{
		
		System.out.println("First method");
	}

	
	public void sub() 
	{
		System.out.println("second method");
		
	}
	public static void main(String[] args)
	{
		Class_InterfaceProg ci1=new Class_InterfaceProg();
		ci1.add();
		ci1.sub();
	}

}
