package basics;

public class Employee 
{
	 void Salary()
	{
		System.out.println("Salary");
		
	}
}
	class Boss extends Employee
	{
	
  static void Bonus()
	{
		System.out.println("Bonus");
		{
}
	}
  
	}
	class Staff extends Boss
	{
		public static void main(String[]args)
		{
			System.out.println(" Main method");
			Staff s1=new Staff();
			s1.Salary();
			Bonus();
			
		}
	}
	
	
