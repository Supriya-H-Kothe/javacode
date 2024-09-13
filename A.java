package basics;

public class A
{
	void Salary()
	{
		System.out.println("Salary");
		
	}
}
	class B extends A
	
	{
	
  static void Bonus()
	{
		System.out.println("Bonus");
		{
}
	}
  
	}
	class C extends B
	{
		public static void main(String[]args)
		{
			System.out.println(" Main method");
			C s1=new C();
			s1.Salary();
			Bonus();
			
		}
	}
	



